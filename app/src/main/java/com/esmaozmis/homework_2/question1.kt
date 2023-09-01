package com.example.homework_2

data class Person(val name: String)

fun main() {
    val people = arrayListOf(
        Person("Esma"),
        Person("Görkem"),
        Person("Merve"),
        Person("Aslı"),
        Person("Feyza")
    )

    println("Lütfen virgülle ayrılmış olarak 3 isim girin: ")

    val input = readLine()

    if (!input.isNullOrEmpty()) {
        val names = input.split(",").map {
            it.trim()
        }
        val newPerson = names.map { Person(it) }
        people.addAll(newPerson)
        println("Son Liste:")
        people.forEach { println(it.name.lowercase()) }
    } else {
        println("Liste boş!!")
    }
}
