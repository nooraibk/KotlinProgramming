package variance

import functions.extensions.random


/**
 * Variance describes the relationship between the container type (VendingMachine) and one of its
 * associates (Coin or Snack). So you can expect relationship between VendingMachine and Coin,
 * or the relationship between VendingMachine and Snack.
 */
interface VendingMachine {
    fun purchase(money: Coin): Snack
    val purchase : (money : Coin) -> Snack
}

/**
 * following class holds the same contract as its interface but the relationship classes VendingMachine, Coin, and Snack
 * can climb up or down in the hierarchy. In other words all three classes can be or cannot be replaced with
 * their child or parent classes, as long as we uphold the contract which is the function must accept the coin and return a snack.
 * In other words as long as the subclasses of the interface VendingMachine still accepts anything that is a coin and return anything
 * that is a snack.
 */
class VendingMachineImpl : VendingMachine {
    override fun purchase(money: Coin): Snack {
        TODO("Not yet implemented")
    }

    override var purchase: (money: Coin) -> Snack
        get() = TODO("Not yet implemented")
        set(value) {}
}

/**
 * So if SimpleVendingMachine is a subtype of VendingMachine, Candy is also a subtype of Snack.
 * In other words, if the container type can become specific, so can the return type.
 * And since container type and one of its return type become specific together, we call them covariance
 */
class SimpleVendingMachine : VendingMachine {
    override fun purchase(money: Coin): Candy {
        return Candy()
    }
    // we cannot replace return type with more generic type (moving upward in hierarchy) as it breaks the contract between container type(VendingMachine) and return type (Snack)
    /*override fun purchase(money: Coin): Product {
        return Product()
    }*/

    //however what if we want to pass more specific parameter type
    //this break the system if we force user to insert only a specific type of currency
    /*override fun purchase(money: Cent): Candy {
        return Candy()
    }*/

    //on the other hand, what if we want to pass more generic parameter type
    //this is generally OK to do so, however kotlin doesn't allow overriding functions to be overloaded
    /*override fun purchase(money: Currency): Candy {
        return Candy()
    }*/

    // if we really want to pass more generic type param, then we can use property as function or lambdas
    /**
     * when the container type become more specific (SimpleVendingMachine) and parameter type become more general(Currency), we call this contra-variance
     */
    override val purchase: (money: Currency) -> Snack = { Candy() }
}





/**
 * some classes to make example more clear
 */

open class Currency
open class Coin : Currency()
open class Cent : Coin()
open class Rubel : Coin()

open class Product
open class Snack : Product(){
    companion object
}
open class Candy : Snack()
open class Sandwich : Snack()
