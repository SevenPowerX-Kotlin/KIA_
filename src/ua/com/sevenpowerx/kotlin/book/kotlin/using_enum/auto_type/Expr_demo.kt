package ua.com.sevenpowerx.kotlin.book.kotlin.using_enum.auto_type

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right)+ eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}