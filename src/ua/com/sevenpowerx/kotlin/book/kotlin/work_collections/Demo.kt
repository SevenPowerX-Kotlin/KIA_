package ua.com.sevenpowerx.kotlin.book.kotlin.work_collections


fun main(args: Array<String>) {
	val strings: List<String> = listOf("first", "second", "fourteenth")
	println(strings.last())

	val numbers: Collection<Int> = setOf(1, 14, 2)
	println(numbers.max())

	val list = listOf(2,3,5,7,11)

	//Оператор (* - звёздочка) распаковывает содержимое массива
	val listSpread = listOf("args: ", *args)
	println(listSpread)

}
