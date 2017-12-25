package ua.com.sevenpowerx.kotlin.book.kotlin

import java.io.BufferedReader
import java.io.StringReader

fun main(args: Array<String>) {
    val percentage = 100
    if (percentage !in 0..100) {
        throw IllegalArgumentException(
                "A percentage value must be between 0 and 100: $percentage"
        )
    }
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}

fun readNumber(reader: BufferedReader): Int? {
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
}
