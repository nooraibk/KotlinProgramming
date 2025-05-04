package variance

interface GenericVendingMachine<out R, in T> { //out means accepts child classes, in means accepts parent classes

    //compilation error as marked with "out" can only appear as return types and not params
//    fun purchase(money : R) : R
    //also compilation error as marked with "in" can only appear as param and not return type
//    fun purchase(money : T) : T
    fun purchase(money: T): R
    val purchase: (T) -> R
}

class GenericSimpleVendingMachine : GenericVendingMachine<Snack, Coin> {

    //works good because covariance
    override fun purchase(money: Coin): Snack {
        return Snack()
    }

    // works good because covariance
    /*override fun purchase(money: Coin): Candy {
        return Candy()
    }*/

    // doesn't work as kotlin does not support contra-variance on functions params
    /*override fun purchase(money: Currency): Candy {
        return Candy()
    }*/

    //works as contra-variance
//    override val purchase: (Currency) -> Candy = { Candy() }

    //variable overriding also works for contra-variance
    override val purchase: (Coin) -> Candy = { Candy() }
}