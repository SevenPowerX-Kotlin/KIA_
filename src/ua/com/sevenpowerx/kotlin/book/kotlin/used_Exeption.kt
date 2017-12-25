package ua.com.sevenpowerx.kotlin.book.kotlin

fun main(args: Array<String>) {
    val percentage = 1000
    if (percentage !in 0..100) {
        throw IllegalArgumentException(
                "A percentage value must be between 0 and 100: $percentage"
        )
    }
}

