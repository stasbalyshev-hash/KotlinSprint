package org.example.app.lesson_5

fun main() {
    val firstLuckyNumber = (0..42).random()
    val secondLuckyNumber = (0..42).random()

    println("Попытайтесь угадать 2 числа:")

    val inputNumber1 = readln().toInt()
    val inputNumber2 = readln().toInt()
    if ((inputNumber1 == firstLuckyNumber && inputNumber2 == secondLuckyNumber) ||
        (inputNumber1 == secondLuckyNumber && inputNumber2 == firstLuckyNumber))
     {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((inputNumber1 == firstLuckyNumber || inputNumber1 == secondLuckyNumber) ||
        (inputNumber2 == firstLuckyNumber || inputNumber2 == secondLuckyNumber))
     {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Для победы нужны были числа: $firstLuckyNumber и $secondLuckyNumber")
}
