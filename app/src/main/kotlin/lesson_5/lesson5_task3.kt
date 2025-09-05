package org.example.app.lesson_5

const val FIRST_LUCKY_NUMBER = 40
const val SECOND_LUCKY_NUMBER = 28

fun main() {

    println("Попытайтесь угадать 2 числа:")

    val inputNumber1 = readln().toInt()
    val inputNumber2 = readln().toInt()
    if (((inputNumber1 == FIRST_LUCKY_NUMBER) && (inputNumber2 == SECOND_LUCKY_NUMBER)) ||
        ((inputNumber1 == SECOND_LUCKY_NUMBER) && (inputNumber2 == FIRST_LUCKY_NUMBER))
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (((inputNumber1 == FIRST_LUCKY_NUMBER) || (inputNumber1 == SECOND_LUCKY_NUMBER)) ||
        ((inputNumber2 == FIRST_LUCKY_NUMBER) || (inputNumber2 == SECOND_LUCKY_NUMBER))
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}


