package ua.com.sevenpowerx.kotlin.book.splaa

data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
            Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")

}

fun findPerso(function: () -> Boolean): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

//fun findAlice() = findPerso{it.name == "Alice"}


//fun findBob() = findPerson{it.name == "Bob"}