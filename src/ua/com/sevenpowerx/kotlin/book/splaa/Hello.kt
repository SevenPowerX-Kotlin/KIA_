package ua.com.sevenpowerx.kotlin.book.splaa


//  Функция имеет тело-блок(block body)
fun max(a: String, b: String): String {
    return if(a>b) "a" else "b"
}
    //Функция имеет тело-выражения(expression body)
//fun max(a: Int, b: Int): Int = if(a>b) a else b
fun max(a: Int, b: Int) = if(a>b) a else b



fun main(args: Array<String>): Unit {
    println("Hello, Kotlin!")
    println(max(1, 2))
}

