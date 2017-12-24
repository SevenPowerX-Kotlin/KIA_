package ua.com.sevenpowerx.kotlin.book.kotlin.using_enum

import ua.com.sevenpowerx.kotlin.book.kotlin.using_enum.Color.*

fun getMnemonic(color: Color) =
        when (color) {


            RED -> "Каждый?"
            ORANGE -> "Охотник?"
            YELLOW -> "Желает?"
            GREEN -> "Знать?"
            BLUE -> "Где?"
            INDIGO -> "Сидит?"
            VIOLET -> "Фазан?"
        }

fun getWarmth(color: Color) = when(color) {
    RED, ORANGE, YELLOW -> "тёплый"
    GREEN -> "нейтральный"
    BLUE,INDIGO,VIOLET -> "холодный"
}

fun main(args: Array<String>) {
    println(getMnemonic(BLUE))
    println(getWarmth(BLUE))

}