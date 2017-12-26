package ua.com.sevenpowerx.kotlin.book.kotlin.glava_1_3

data class Person(
        val name: String,       //Неизменяемое свойство: для него будут созданы поле и простой метод чтения
        val age: Int? = null,   //Неизменяемое свойство: для него будут созданы поле и простой метод чтения
        var isMarried: Boolean  //Изменяемое свойство:поле, методы чтения и записи
)
