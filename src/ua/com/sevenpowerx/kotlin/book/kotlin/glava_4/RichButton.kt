package ua.com.sevenpowerx.kotlin.book.kotlin.glava_4

import ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.used_interface.Clicable

open class RichButton: Clicable {

	fun disabl() {}

	open fun animate(){}

	final override fun click() {
		TODO("not implemented")
	}
}