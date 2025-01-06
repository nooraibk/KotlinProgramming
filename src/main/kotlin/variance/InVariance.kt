package variance

interface InVariance<T>{
    fun printObject(obj : T)
}

class InVarianceImpl : InVariance<Snack>{

//    override fun printObject(obj: Candy) {
//    override fun printObject(obj: Product) {
    /**
     * both above variations will not work as in variance only allows exact type, not specific (downward in the hierarchy) not generic (upward in the hierarchy)
     */
    override fun printObject(obj: Snack) {
        println("printing InVariance Object = $obj")
    }
}