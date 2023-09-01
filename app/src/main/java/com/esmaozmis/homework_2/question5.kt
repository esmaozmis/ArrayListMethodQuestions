package com.example.homework_2

data class Calisanlar(val ad: String, var maas: Double)

val calisanlar = arrayListOf(
    Calisanlar("Esma Ozmiş", 20000.0),
    Calisanlar("Görkem Esen", 17000.0),
    Calisanlar("Hatice Kara", 29000.0),
    Calisanlar("Merve Yokar", 18500.0)
)

fun main() {
    calisanlar.forEach { calisan ->
        val zamliMaas = calisan.maas * 1.35
        calisan.maas = zamliMaas
    }

    calisanlar.shuffle()
    calisanlar.sortBy { it.maas }

    val enDusukMaasliCalisan = calisanlar.first()
    val enYuksekMaasliCalisan = calisanlar.last()
    println("En düşük maaşlı çalışan: ${enDusukMaasliCalisan.ad}, Maaş: ${enDusukMaasliCalisan.maas}")
    println("En yüksek maaşlı çalışan: ${enYuksekMaasliCalisan.ad}, Maaş: ${enYuksekMaasliCalisan.maas}")

    val toplamMaas = calisanlar.sumOf { it.maas }
    val ortalamaMaas = toplamMaas / calisanlar.size
    println("Ortalama Maaş: $ortalamaMaas")
}
