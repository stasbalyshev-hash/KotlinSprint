package org.example.app.lesson_5

import kotlin.math.pow

const val PERCENT = 100
const val SQUARE = 2

fun main() {
    println("Введите свой вес в кг: ")
    val userWeight = readln().toDouble()
    println("Введите свой рост в см: ")
    val userHeight = readln().toDouble()
    val convertedHeight = userHeight / PERCENT
    val bodyMassIndex = userWeight / (convertedHeight).pow(SQUARE)
    if (bodyMassIndex < 18.5) {
        println("%.2f".format(bodyMassIndex))
        println("Ваша категория веса: недостаточная масса тела")
    } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
        println("%.2f".format(bodyMassIndex))
        println("Ваша категория веса: нормальная масса тела")
    } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
        println("%.2f".format(bodyMassIndex))
        println("Ваша категория веса: избыточная масса тела")
    } else {
        println("%.2f".format(bodyMassIndex))
        println("Ваша категория веса: ожирение")
    }
}