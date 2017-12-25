package ua.com.sevenpowerx.kotlin.book.kotlin.create_collection

fun main(args: Array<String>) {
	val list = listOf<Int>(1, 2, 3)
	println(list.joinToString(separator = "; ",prefix = "(", postfix = ")"))
	println(list.joinToString(" "))

	println(listOf("one", "two", "eight").joinMy(" "))
	println(listOf(1, 2, 3))
//	println(listOf(1, 2, 3).joinMy(" "))    //ошибка
}