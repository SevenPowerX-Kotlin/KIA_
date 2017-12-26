package ua.com.sevenpowerx.kotlin.book.kotlin.glava_4

import ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.used_interface.Focusable

internal open class TalkativeButton : Focusable {
	private fun yell() = println("Hey!")
	protected fun whisper() = println("Let's talk!")
}

//запрещает ссылатся на тип с более узкой областью видемости
//fun TalkativeButton.giveSpeech(){}