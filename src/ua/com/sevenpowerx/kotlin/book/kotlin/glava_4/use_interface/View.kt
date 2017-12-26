package ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.use_interface

interface View {
	fun getCurrentState():State
	fun restoreState(state: State){}
}