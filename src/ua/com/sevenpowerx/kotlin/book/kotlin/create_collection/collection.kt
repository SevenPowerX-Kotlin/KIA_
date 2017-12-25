package ua.com.sevenpowerx.kotlin.book.kotlin.create_collection

fun main(args: Array<String>) {

    val set = hashSetOf(1, 7, 53)
    val listArrayListOf = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")


    println(set.javaClass)
    println(listArrayListOf.javaClass)
    println(map.javaClass)

    val strings = listOf("first", "second", "fourtenth")
    println(strings.last() + " - Последний элемент.")
    println(strings.first() + " - Первый элемент.")

    val numbers = setOf(1, 14, 2)
    println("${numbers.max()}   - Максимальное число с колекции")

    val list = listOf(1, 2, 3)
    println(list)
    println(joinToString(list,";","(",")"))




}

fun<T>joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
): String{
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}


