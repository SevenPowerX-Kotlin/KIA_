package ua.com.sevenpowerx.kotlin.book.kotlin

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get(){
        return height == width
    }
}