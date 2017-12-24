package ua.com.sevenpowerx.kotlin.book.kotlin.used_while

fun main(args: Array<String>) {
  /*  val condition = false
    while (condition){
        *//*...........*//*
    }
    do {
        *//*...*//*
    }while (condition)*/


   /* for (i in 1..100) {
       if(i%10!=0)
        print(fizzBuzz(i))
        else
        println(fizzBuzz(i))
    }*/
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}