package org.example.app.lesson_5

fun main() {
    val firstLuckyNumber = (0..42).random()
    val secondLuckyNumber = (0..42).random()
    val thirdLuckyNumber = (0..42).random()
    val listOfRandomNumber = listOf(firstLuckyNumber, secondLuckyNumber, thirdLuckyNumber)

    println("Попытайтесь угадать 3 числа:")

    val inputNumber1 = readln().toInt()
    val inputNumber2 = readln().toInt()
    val inputNumber3 = readln().toInt()
    val listOfUserInputNumber = listOf(inputNumber1, inputNumber2, inputNumber3)
    val overlap = listOfRandomNumber.intersect(listOfUserInputNumber).size
    when (overlap) {
        3 -> println("Поздравляем! Вы угадали $overlap числа(ло) и выиграли джекпот!")
        2 -> println("Поздравляем! Вы угадали $overlap числа(ло) и выиграли крупный приз!")
        1 -> println("Поздравляем! Вы угадали $overlap числа(ло) и получаете утешительный приз!")
        0 -> println("К сожалению вы не угадали ни одного числа.")
    }
    println("Выигрышные числа: $firstLuckyNumber, $secondLuckyNumber, $thirdLuckyNumber")
}
