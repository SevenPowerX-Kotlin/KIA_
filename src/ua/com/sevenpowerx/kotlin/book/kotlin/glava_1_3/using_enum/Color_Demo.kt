package ua.com.sevenpowerx.kotlin.book.kotlin.glava_1_3.using_enum

import ua.com.sevenpowerx.kotlin.book.kotlin.glava_1_3.using_enum.Color.*


fun main(args: Array<String>) {
    println(getMnemonic(BLUE))
    println(getWarmth(BLUE))
    println(mix(BLUE, YELLOW))
    println(mixOptimized(BLUE, YELLOW))

}

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

fun getWarmth(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "тёплый"
    GREEN -> "нейтральный"
    BLUE, INDIGO, VIOLET -> "холодный"
}

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(BLUE, YELLOW) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Грязный цвет")
        }

fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == RED && c2 == YELLOW) ||
                    (c1 == YELLOW && c2 == RED) ->
                ORANGE
            (c1 == YELLOW && c2 == BLUE) ||
                    (c1 == BLUE && c2 == YELLOW) ->
                GREEN
            (c1 == BLUE && c2 == VIOLET) ||
                    (c1 == VIOLET && c2 == BLUE) ->
                INDIGO
            else -> throw Exception("Dirty color")
        }


