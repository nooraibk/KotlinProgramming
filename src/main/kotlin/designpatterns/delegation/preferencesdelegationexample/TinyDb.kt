package designpatterns.delegation.preferencesdelegationexample

import functions.extensions.delegates

fun main(){
//    val tinyDb = TinyDb(MockSharedPreferences())
    val tinyDb = TinyDbAdv(MockSharedPreferences())
//    tinyDb.updateDark()
    /*println("beforeUpdate = ${tinyDb.prefsIsDark}")
    tinyDb.prefsIsDark = true
    println("afterUpdate = ${tinyDb.prefsIsDark}")
    tinyDb.prefsIsDark = false
    println("afterUpdateAgain = ${tinyDb.prefsIsDark}")*/

    tinyDb.testDate()

}

class TinyDb(preferences : MockSharedPreferences) {
    var prefsIsDark : Boolean by preferences

    fun updateDark() {
        println("beforeUpdate = $prefsIsDark")
        prefsIsDark = true
        println("afterUpdate = $prefsIsDark")
        prefsIsDark = false
        println("afterUpdateAgain = $prefsIsDark")
    }
}


class TinyDbAdv(preferences: MockSharedPreferences){
    var prefsIsDark : Boolean by preferences.delegates.boolean()
    var prefDate : Long by preferences.delegates.long(null, 60000L)
    var prefName : String by preferences.delegates.string("LOCAL_USER", "Johnny")

    fun testDate(){
        println("beforeUpdate = $prefDate")
        prefDate = 1000L
        println("afterUpdate = $prefDate")
        prefDate = 2000L
        println("afterUpdateAgain = $prefDate")
    }
}