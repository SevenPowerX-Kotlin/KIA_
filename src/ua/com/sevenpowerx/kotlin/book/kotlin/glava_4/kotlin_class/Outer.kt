package ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.kotlin_class

class Outer {
	inner class Inner {
		fun getOuterReference(): Outer = this@Outer
	}
}