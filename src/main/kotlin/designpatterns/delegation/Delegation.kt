package designpatterns.delegation

import kotlin.reflect.KProperty

//Delegation is an OODesign Pattern and kotlin supports it natively

fun main(){
    val file = "File1.mkv"
    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
    mediaFile.download()
    mediaFile.play()
    mediaFile.stop()


    //pending
    val testVar by test()
    println(testVar)
}

interface Downloader{
    fun download()
}

interface Player{
    fun play()
    fun stop()
}

class FileDownloader(private val file: String): Downloader {
    override fun download() {
        println("$file Downloaded")
    }
}

class FilePlayer(private val file: String): Player {
    override fun play() {
        println("$file Playing")
    }

    override fun stop() {
        println("$file Stopped")
    }
}


//pending
class Test {
    operator fun getValue(a: Int?, b: KProperty<*>): Int? {
        return 3
    }
}
fun test() = Test()

//this is a conventional way of writing delegation pattern however kotlin supports it natively
//class MediaFile(private val downloader: Downloader, private val player: Player): Downloader, Player{
//    override fun download() {
//        downloader.download()
//    }
//
//    override fun play() {
//        player.play()
//    }
//}

//we can write delegation pattern by using "by" keyword and remove boilerplate code

class MediaFile(private val downloader: Downloader, private val player: Player): Downloader by downloader, Player by player


/**
 * **by keyword in Kotlin
 *
 * In simple words, you can understand by keyword as provided by.
 *
 * From the perspective of property consumer, val is something that has getter (get) and var is something that has getter and setter (get, set). For each var property there is a default provider of get and set methods that we don't need to specify explicitly.
 *
 * But, when using by keyword, you are stating that this getter/getter&setter is provided elsewhere (i.e. it's been delegated). It's provided by the function that comes after by.
 *
 * So, instead of using this built-in get and set methods, you are delegating that job to some explicit function.
 *
 * One very common example is the by lazy for lazy loading properties. Also, if you are using dependency injection library like Koin, you'll see many properties defined like this:
 *
 * var myRepository: MyRepository by inject()  //inject is a function from Koin
 *
 * In the class definition, it follows the same principle, it defines where some function is provided, but it can refer to any set of methods/properties, not just get and set.
 *
 * class MyClass: SomeInterface by SomeImplementation, SomeOtherInterface
 *
 * This code is saying: 'dsl.I am class MyClass and dsl.I offer functions of interface SomeInterface which are provided by SomeImplementation. dsl.I'll implement SomeOtherInterface by myself (that's implicit, so no by there).'
 *
 * ref: https://stackoverflow.com/questions/38250022/what-does-by-keyword-do-in-kotlin
 */


val abc = ""