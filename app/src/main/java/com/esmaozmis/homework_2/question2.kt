package com.example.homework_2

fun main() {
    val names = arrayListOf("Esma", "Görkem", "Merve", "Aslı", "Feyza")

    names.sort()
    println(names)

    println("Lütfen bir isim girin: ")

    val input = readLine()

    if (input != null) {
        if (names.contains(input)) {
            val newName = input.uppercase().reversed()

            println("İsmin tersden okunuşu: $newName")

        } else {
            println("Girdiğiniz isim listede bulunamadı!")

        }
    }
}
