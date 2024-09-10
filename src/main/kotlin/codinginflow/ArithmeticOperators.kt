fun main(){
    var a = 3
    val b = 8.4 //try initializing with only int variable rather than double

    /**
    changing one of the datatypes in the print expression will automatically change the datatype of whole expression. e.g. if the value of both a and b will be integer then entire print expression will be integer. however, if the value of a or b will be changed to double the entire print expression will be double
    */

    println("a / b = ${a/b}")
}