package org.example.app.lesson_5

fun main() {
    val firstNumber = (1..99).random()
    val secondNumber = (1..99).random()

    println("Решите пример: $firstNumber + $secondNumber = ")

    val userAnswer = readln().toInt()
    if (userAnswer == firstNumber + secondNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}