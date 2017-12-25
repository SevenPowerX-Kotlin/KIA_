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