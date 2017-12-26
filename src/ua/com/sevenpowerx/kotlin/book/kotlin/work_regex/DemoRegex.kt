package ua.com.sevenpowerx.kotlin.book.kotlin.work_regex

fun main(args: Array<String>) {
	val str = "12.345-6.A"
	println(str)
	println(str.split("."))
	println(str.split(".", "-"))
	println(str.split("\\.|-".toRegex()))

}