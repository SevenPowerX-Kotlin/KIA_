package ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.used_interface


fun main(args: Array<String>) {
	val button = Button()
	button.showOff()
	button.setFocus(true)
	button.click()
}

class Button: Clicable, Focusable{
	override fun showOff() {
		super<Clicable>.showOff()
		super<Focusable>.showOff()
	}

	override fun click() {
		println("I was clicked")
	}

}