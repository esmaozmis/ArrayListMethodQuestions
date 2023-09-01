package com.esmaozmis.homework_2

data class Ogrenci(val ad: String, val yas: Int, val okul: String)

val ogrenciler = arrayListOf(
    Ogrenci("Esma", 23, "Üniversite A"),
    Ogrenci("Görkem", 24, "Üniversite B"),
    Ogrenci("Merve", 25, "Üniversite C"),
    Ogrenci("Aslı", 28, "Üniversite A"),
    Ogrenci("Cüneyt", 29, "Üniversite B"),
    Ogrenci("Feyza", 20, "Üniversite A"),
    Ogrenci("Hatice", 22, "Üniversite B"),
    Ogrenci("Caner", 26, "Üniversite A")
)

fun main() {
    val enYasliOgrenci = ogrenciler.maxByOrNull { it.yas }
    val enGencOgrenci = ogrenciler.minByOrNull { it.yas }

    if (enYasliOgrenci != null && enGencOgrenci != null) {
        println("En yaşlı öğrenci: ${enYasliOgrenci.ad}, (${enYasliOgrenci.yas})")
        println("En genç öğrenci: ${enGencOgrenci.ad}, (${enGencOgrenci.yas})")
    }

    val okulAOGrencileri = ogrenciler.filter { it.okul == "Üniversite A" }

    val yasindanBuyuk25 = okulAOGrencileri.filter { it.yas > 25 }
    val yasindanKucuk25 = okulAOGrencileri.filter { it.yas < 25 }

    println("25 yaşından büyük öğrenciler:")
    yasindanBuyuk25.forEach { println("${it.ad}, (${it.yas})") }

    println("25 yaşından küçük öğrenciler:")
    yasindanKucuk25.forEach { println("${it.ad}, (${it.yas})") }
}
