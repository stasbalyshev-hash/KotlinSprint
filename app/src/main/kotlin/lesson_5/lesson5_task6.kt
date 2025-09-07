package org.example.app.lesson_5

import kotlin.math.pow

const val PERCENT = 100
const val SQUARE = 2
const val UNDERWEIGHT_LIMIT = 18.5
const val NORMAL_LIMIT = 25
const val OVERWEIGHT_LIMIT = 30

fun main() {
    println("Введите свой вес в кг: ")
    val userWeight = readln().toDouble()
    println("Введите свой рост в см: ")
    val userHeight = readln().toDouble()
    val convertedHeight = userHeight / PERCENT
    val bodyMassIndex = userWeight / (convertedHeight).pow(SQUARE)

    println("Ваш ИМТ = %.2f".format(bodyMassIndex))

    when {
        bodyMassIndex < UNDERWEIGHT_LIMIT -> println("Ваша категория веса: недостаточная масса тела")
        bodyMassIndex < NORMAL_LIMIT -> println("Ваша категория веса: нормальная масса тела")
        bodyMassIndex < OVERWEIGHT_LIMIT -> println("Ваша категория веса: избыточная масса тела")
        else -> println("Ваша категория веса: ожирение")
    }
}
