package ua.com.sevenpowerx.kotlin.book.kotlin

data class Person(val name: String,
                  val age: Int? = null)
fun findPerso(function: () -> Boolean): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
            Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")

    val s: String? = null
    val s2: String = ""
    val s3: String = "Hello, Kotlin!!!"
    val value = s3


    if(value is String)
        println(value.toUpperCase())
    if(value is String)
        println(value.toLowerCase())


}



//fun findAlice() = findPerson{it.name == "Alice"}


//fun findBob() = findPerson{it.name == "Bob"}
/*
fun renderPersonList(persons: Collection<Person>)=
        create HTML().table{
            for (person in persons) {
                td{ +person.name }
                td{ +person.age }

            }
        }*/

//fun createHTML(): Any {}
/*

object CountryTable : IdTable(){
    val name = varchar("name", 250).uniqueIndex

}*/


