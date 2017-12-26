package ua.com.sevenpowerx.kotlin.book.kotlin.work_regex

fun main(args: Array<String>) {
	val str = "12.345-6.A"
	println(str)
	println(str.split("."))
	println(str.split(".", "-"))
	println(str.split("\\.|-".toRegex()))

	println("Parse Path")
	val path = "/Users/yole/kotlin-book/chapter.adoc"
	println(parsePath(path))
	println("reg")
	println(parsePathToReg(path))

}

fun parsePath(path: String): String {
	val directory = path.substringBeforeLast("/")
	val fullName = path.substringAfterLast("/")

	val fileName = fullName.substringBeforeLast(".")
	val extension = fullName.substringAfterLast(".")

	return "Dir: $directory, name: $fileName, ext: $extension"
}

fun parsePathToReg(path: String): String {
	var str: String = ""
	val regex = """(.+)/(.+)\.(.+)""".toRegex()
	val matchResult = regex.matchEntire(path)
	if (matchResult != null) {
		val(directory, fileName, extension) = matchResult.destructured
		str = "Dir: $directory, name: $fileName, ext: $extension"
	}else str = "Null"

	return str
}