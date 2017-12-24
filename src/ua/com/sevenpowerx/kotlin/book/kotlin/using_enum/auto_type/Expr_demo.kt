package ua.com.sevenpowerx.kotlin.book.kotlin.using_enum.auto_type

fun main(args: Array<String>) {
    println(eval(Sum(Num(1), Num(2))))
}

fun eval(e: Expr): Int =
    if (e is Num) {
       e.value
    }else if (e is Sum) {
        eval(e.right)+ eval(e.left)
    }else {
        throw IllegalArgumentException("Unknown expression")
    }