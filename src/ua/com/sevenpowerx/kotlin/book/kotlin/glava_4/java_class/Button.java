package ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.java_class;

import ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.use_interface.State;
import ua.com.sevenpowerx.kotlin.book.kotlin.glava_4.use_interface.View;

public class Button implements View {
	@Override
	public State getCurrentState() {
		return new ButtonState();
	}
	
	@Override
	public void restoreState(State state) {
	/*...*/
	}
	
	static private class ButtonState implements State {
	}
}
