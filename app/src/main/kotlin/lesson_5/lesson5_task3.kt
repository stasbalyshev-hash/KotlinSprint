package org.example.app.lesson_5

fun main() {
    val FIRST_LUCKY_NUMBER = (0..42).random()
    val SECOND_LUCKY_NUMBER = (0..42).random()

    println("Попытайтесь угадать 2 числа:")

    val inputNumber1 = readln().toInt()
    val inputNumber2 = readln().toInt()
    if ((inputNumber1 == FIRST_LUCKY_NUMBER && inputNumber2 == SECOND_LUCKY_NUMBER) ||
        (inputNumber1 == SECOND_LUCKY_NUMBER && inputNumber2 == FIRST_LUCKY_NUMBER))
     {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((inputNumber1 == FIRST_LUCKY_NUMBER || inputNumber1 == SECOND_LUCKY_NUMBER) ||
        (inputNumber2 == FIRST_LUCKY_NUMBER || inputNumber2 == SECOND_LUCKY_NUMBER))
     {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Для победы нужны были числа: $FIRST_LUCKY_NUMBER и $SECOND_LUCKY_NUMBER")
}
