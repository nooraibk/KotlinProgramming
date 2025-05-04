package designpatterns.di

fun main(){
    val obj = BillingClass()
    obj.checkout(Customer(), BillService())
}

class BillingClass{
    fun checkout(customer: Customer, biller: BillService){ //how is it decoupled
        biller.billCustomer(customer)
        alertMessage()
    }

    private fun alertMessage(){
        println("Dear customer you are being billed")
    }
}

class BillService{
    fun billCustomer(customer: Customer){
        println("Billing ${customer.customerName}")
    }
}

class Customer{
    var customerName = "Ali"
}