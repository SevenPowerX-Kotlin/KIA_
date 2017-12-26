package ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.used_interface

interface Focusable {
	fun setFocus(b: Boolean) =
			println("I ${if (b) "got" else "lost"} focus.")

	fun showOff() = println("I'm focusable!")
}