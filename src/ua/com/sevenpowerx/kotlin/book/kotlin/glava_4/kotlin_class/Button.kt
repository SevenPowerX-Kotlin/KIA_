package ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.kotlin_class

import ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.use_interface.State
import ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.use_interface.View

class Button: View
{
	override fun getCurrentState(): State = ButtonState()
	override fun restoreState(state: State) {/*...*/	}

	inner class ButtonState : State {/*...*/}

}