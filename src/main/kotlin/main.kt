package ru.netology

fun main() {
    val buyAmount = 100 // сумма покупки
    val discount = 100 // скидка 100 руб
    val discount5 = 5 // скидка 5%
    val discountCustomer = 1 // скидка 1% пост. клиенту
    val regularCustomer = false // пост. клиент или нет

    var discountPrice = 0

    if (buyAmount in 0..1000) {
        discountPrice = buyAmount
    } else if (buyAmount in 1001..10_000) {
        discountPrice = buyAmount - discount
    } else if (buyAmount > 10_000) {
        discountPrice = buyAmount - (buyAmount / 100 * discount5)
    }

    val resultPrice = if (regularCustomer) {
        discountPrice - (discountPrice / 100 * discountCustomer)
    } else discountPrice

    println("Сумма покупки: $resultPrice руб.")
}