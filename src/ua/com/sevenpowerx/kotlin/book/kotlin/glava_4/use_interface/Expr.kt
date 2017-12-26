package ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.use_interface

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
		when (e) {
			is Num -> e.value
			is Sum -> eval(e.left) + eval(e.left)
			else ->
					throw IllegalArgumentException("Unknown expression")
		}