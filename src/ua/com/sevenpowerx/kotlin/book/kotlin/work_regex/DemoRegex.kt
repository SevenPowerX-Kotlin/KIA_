package ua.com.sevenpowerx.kotlin.book.kotlin.work_regex

fun main(args: Array<String>) {
	println("12.345-6.A".split("\\.|-".toRegex()))
}