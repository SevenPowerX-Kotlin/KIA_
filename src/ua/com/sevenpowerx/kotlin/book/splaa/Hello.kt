package ua.com.sevenpowerx.kotlin.book.splaa


//  Функция имеет тело-блок(block body)
fun max(a: String, b: String): String {
    return if(a>b) "a" else "b"
}
    //Функция имеет тело-выражения(expression body)
//fun max(a: Int, b: Int): Int = if(a>b) a else b
fun max(a: Int, b: Int) = if(a>b) a else b



fun main(args: Array<String>): Unit {
    println("Hello, Kotlin!")
    println(max(1, 2))

    val question =
            "The Ultimate Question of Life, the Universe, and Everything"
    val answer = 42
//    answer = "no answer"  //ошибка

    val answerSplx: Int = 25

    val yearToComputer = 7.5e6

    val answerAndrey: Int //указывать явно
    answerAndrey = 40


    //val(от value) - неизменяемая ссылка
    //var(от variable - изменяемая ссылка

    val message: String
    if (canPerformOperation()) {
        message = "Success"
        // ... выполнить операцию
    }
    else{
        message = "Failed"
    }
    val languages = arrayListOf<String>("Java")
    languages.add("Kotlin")



}

fun canPerformOperation(): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

