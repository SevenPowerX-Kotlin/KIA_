package ua.com.sevenpowerx.kotlin.book.kotlin.using_enum.auto_type

fun main(args: Array<String>) {
//    println(eval(Sum(Num(1), Num(2))))
    evalWithLogging(Sum(Sum(Num(1),Num(2)),Num(4)))
}

fun eval(e: Expr): Int =
   when(e){
       is Num -> e.value
       is Sum -> eval(e.right) + eval(e.left)
       else ->
        throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum ->{
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                left+right
            }
            else-> throw IllegalArgumentException("Uncnown exeption")

        }