package ua.com.sevenpowerx.kotlin.book.kotlin.glava_1_3.geometry.shapes

import java.util.*

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get()=height == width
}

fun createRandomRectangle(): Rectangle {
val random = Random()
return Rectangle(random.nextInt(), random.nextInt())
}