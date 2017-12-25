package ua.com.sevenpowerx.kotlin.book.kotlin.work_collections


fun main(args: Array<String>) {
	val strings: List<String> = listOf("first", "second", "fourteenth")
	println(strings.last())

	val numbers: Collection<Int> = setOf(1, 14, 2)
	println(numbers.max())
}
