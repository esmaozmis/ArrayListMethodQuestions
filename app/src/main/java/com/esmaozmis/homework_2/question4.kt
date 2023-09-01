package com.esmaozmis.homework_2

data class CoinCevap(
    val ad: String,
    val coinId: String,
    val karmasikAlgoritma: String?,
    val aciklama: String,
    val resim: String,
    val suankiFiyat: Float,
    val fiyatDegisimYuzdesi24s: Float
)

data class CoinArayuz(
    val ad: String,
    val coinId: String,
    val aciklama: String,
    val resim: String
)

val coinListesi = arrayListOf(
    CoinCevap(
        ad = "Bitcoin",
        coinId = "BTC",
        karmasikAlgoritma = "SHA-256",
        aciklama = "Bitcoin, merkezi olmayan bir dijital para birimidir ve merkez bankası veya tek bir yönetici olmadan işler.",
        resim = "https://ornek.com/bitcoin.png",
        suankiFiyat = 34789.21F,
        fiyatDegisimYuzdesi24s = -2.34F
    ),
    CoinCevap(
        ad = "Ethereum",
        coinId = "ETH",
        karmasikAlgoritma = "Ethash",
        aciklama = "Ethereum, geliştiricilerin akıllı sözleşmeler oluşturmasına ve dağıtmasına olanak tanıyan açık kaynaklı bir blok zinciri tabanlı platformdur.",
        resim = "https://ornek.com/ethereum.png",
        suankiFiyat = 2110.45F,
        fiyatDegisimYuzdesi24s = 0.78F
    ),
    CoinCevap(
        ad = "Litecoin",
        coinId = "LTC",
        karmasikAlgoritma = "Scrypt",
        aciklama = "Litecoin, dünya genelinde herhangi birine anında, hemen hemen sıfır maliyetle ödeme yapmayı sağlayan bir eşten eşe kripto para birimidir.",
        resim = "https://ornek.com/litecoin.png",
        suankiFiyat = 129.57F,
        fiyatDegisimYuzdesi24s = -1.12F
    ),
    CoinCevap(
        ad = "Ripple",
        coinId = "XRP",
        karmasikAlgoritma = null,
        aciklama = "Ripple, hızlı, düşük maliyetli uluslararası para transferlerini kolaylaştırmak amacıyla tasarlanmış bir dijital ödeme protokolü ve kripto para birimidir.",
        resim = "https://ornek.com/ripple.png",
        suankiFiyat = 0.5483F,
        fiyatDegisimYuzdesi24s = 1.45F
    )
)

fun main() {
    val donusturulmusListe = coinListesi.map { coin ->
        CoinArayuz(
            ad = coin.ad,
            coinId = coin.coinId,
            aciklama = coin.aciklama,
            resim = coin.resim
        )
    }

    donusturulmusListe.forEach { coin ->
        println("Ad: ${coin.ad}")
        println("Coin ID: ${coin.coinId}")
        println("Açıklama: ${coin.aciklama}")
        println("Resim: ${coin.resim}")
        println("---------------------------")
    }
}
