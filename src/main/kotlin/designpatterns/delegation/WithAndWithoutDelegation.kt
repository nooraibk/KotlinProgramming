package designpatterns.delegation

fun main() {
    execWithoutDelegation()
    println("**********************")
//    execDelegationWithoutBy()
    execDelegationWithBy()
}



//************** Without Delegation *****************
// User class that handles notifications directly which violates the single responsibility principle
class NoDelegationUser{
    fun notifyBySms(message : String){
        println("Sending sms : $message")
    }

    fun notifyByEmail(message: String){
        println("Sending email : $message")
    }
}


fun execWithoutDelegation(){
    val user = NoDelegationUser()
    user.notifyBySms("Running Without Delegation")
    user.notifyByEmail("Running Without Delegation")
}


//************** With Delegation but without using "by" keyword *****************


interface Notifier{
    fun sendMessage(message : String)
}


class EmailNotifier : Notifier{
    override fun sendMessage(message: String) {
        println("Sending email : $message")
    }
}

class SmsNotifier : Notifier{
    override fun sendMessage(message: String) {
        println("Sending sms : $message")
    }
}

//now the User class is not responsible for notifications
class DelegationUser(private var notifier: Notifier){
    fun notifyUser(message: String){
        //delegate the notification task to Notifier instance
        notifier.sendMessage(message)
    }
}

fun execDelegationWithoutBy(){
    val delegationUser1 = DelegationUser(EmailNotifier())
    delegationUser1.notifyUser("Running with Delegation without by with email")

    val delegationUser2 = DelegationUser(SmsNotifier())
    delegationUser2.notifyUser("Running with Delegation without by with sms")
}


//************** With Delegation using "by" keyword *****************

//now the User class is not responsible for notifications
class DelegationUserWithBy(private val notifier: Notifier) : Notifier by notifier {
    fun notifyUser(message: String){
        //delegate the notification task to Notifier instance
        sendMessage(message)
    }
}

fun execDelegationWithBy(){
    val delegationUser1 = DelegationUserWithBy(EmailNotifier())
    delegationUser1.notifyUser("Running with Delegation using by with email")

    val delegationUser2 = DelegationUserWithBy(SmsNotifier())
    delegationUser2.notifyUser("Running with Delegation using by with sms")
}
