package ua.com.sevenpowerx.kotlin.book.kotlin.create_collection;

//import strings.StringFunctions.*;

import strings.StringFunctions;

import java.util.Arrays;
import java.util.Collection;

public class Main {
	private Collection<String> list = Arrays.asList("1", "2", "3");
	
	String str = StringFunctions.joinToString(list, "","","");
	char c = StringFunctions.lastChar("Java");
}
