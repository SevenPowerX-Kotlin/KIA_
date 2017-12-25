package ua.com.sevenpowerx.kotlin.book.kotlin.create_collection

fun main(args: Array<String>) {
	val list = listOf<Int>(1, 2, 3)
	println(list.joinToString(separator = "; ",prefix = "(", postfix = ")"))
	println(list.joinToString(" "))

	println(listOf("one", "two", "eight").joinMy(" "))
	println(listOf(1, 2, 3))
//	println(listOf(1, 2, 3).joinMy(" "))    //ошибка

	val view: View = Button()
	view.click()
	view.showOff()

}
open class View{
	open fun click() = println("View clicked")
}

class Button: View(){
	override fun click() {
		println("Button clicked")
	}
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")