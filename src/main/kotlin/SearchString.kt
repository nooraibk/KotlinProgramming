fun main(){
    val names = arrayOf("John", "Joanna", "Jacob", "Jolene")
    val searchStr = "jo"
    val filteredNames = names.filter { it.contains(searchStr, ignoreCase = true) }
    println(filteredNames)
}