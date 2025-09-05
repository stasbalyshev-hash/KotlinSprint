package org.example.app.lesson_5

import kotlin.random.Random

fun main() {
    val random = Random
    val firstNumber = random.nextInt(99)
    val secondNumber = random.nextInt(99)
    val sum = firstNumber + secondNumber

    println("Решите пример: $firstNumber + $secondNumber = ")

    val userAnswer = readln().toInt()
    if (userAnswer == sum) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}