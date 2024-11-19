package designpatterns.di

fun main(){
    val objNoDI = BillingClassNoDI()
    objNoDI.checkout(CustomerNoDI())
}

class BillingClassNoDI{

    fun checkout(classTwo: CustomerNoDI){
        billCustomer(classTwo)
        alertMessage()
    }

    private fun billCustomer(classTwo: CustomerNoDI){
        println("Billing ${classTwo.customerName}")
    }

    private fun alertMessage(){
        println("Dear customer you are being billed")
    }
}

class BillServiceNoDI{
    fun bill(classTwo: CustomerNoDI){
        println("Billing ${classTwo.customerName}")
    }
}

class CustomerNoDI{
    var customerName = "Ali"
}