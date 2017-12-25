package ua.com.sevenpowerx.kotlin.book.kotlin.used_while

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println(isLetter('q'))

    println(isNotDigit('x'))

    println(recognize('8'))

    println(recognize('F'))
//class String implementing interface Comparable
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java","Scala"))
}

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "\$c = $c - It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "\$c = $c - It's a letter!"
    else -> "I don't know.."
}