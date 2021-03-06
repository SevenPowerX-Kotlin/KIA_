@file:JvmName("StringFunctions")

package strings
//fun joinToString(...): String { ... }
var opCount: Int = 0
const val UNIX_LINE_SEPARATOR = "\n"

fun <T> joinToString(collection: Collection<T>,
                     separator: String = ", ",
                     prefix: String = "",
                     postfix: String = ""
): String {
	val result = StringBuilder(prefix)

	for ((index, element) in collection.withIndex()) {
		if (index > 0) result.append(separator)
		result.append(element)
	}
	result.append(postfix)
	return result.toString()
}

fun performOperation(){
	opCount++
}
fun reportOperationCount(){
	println("Operation perfomed $opCount times")
}
//fun String.lastChar(): Char = this.get(this.length-1)
fun String.lastChar(): Char = get(length-1) //this можно опустить


fun main(args: Array<String>) {
	println("Kotlin".lastChar())
	val sb = StringBuilder("Kotlin?")
	sb.lastChar = '!'
	println(sb)

}
val String.lastChar: Char
		get() = get(length-1)

var StringBuilder.lastChar: Char
	get() = get(length-1)
	set(value: Char) {
		this.setCharAt(length - 1, value)
	}