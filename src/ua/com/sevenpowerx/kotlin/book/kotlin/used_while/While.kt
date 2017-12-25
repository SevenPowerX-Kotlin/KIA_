package ua.com.sevenpowerx.kotlin.book.kotlin.used_while

import java.util.*

fun main(args: Array<String>) {
  /*  val condition = false
    while (condition){
        ...........
    }
    do {
        ...
    }while (condition)


    for (i in 1..100) {
       if(i%10!=0)
        print(fizzBuzz(i))
        else
        println(fizzBuzz(i))
    }*/
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
    /*
    for (x in 0 until size)
        for(x in 0..size-1)*/


    println()
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11", "1001")
    for ((index, element)in list.withIndex()){
        println("$index: $element")
    }
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}