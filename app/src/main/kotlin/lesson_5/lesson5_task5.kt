package org.example.app.lesson_5

fun main() {
    val listRandom = List(3) { (0..42).random() }

    println("Попытайтесь угадать 3 числа:")

    val inputList = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    val overlap = inputList.intersect(listRandom).size

    when (overlap) {
        3 -> println("Поздравляем! Вы угадали $overlap числа(ло) и выиграли джекпот!")
        2 -> println("Поздравляем! Вы угадали $overlap числа(ло) и выиграли крупный приз!")
        1 -> println("Поздравляем! Вы угадали $overlap числа(ло) и получаете утешительный приз!")
        0 -> println("К сожалению вы не угадали ни одного числа.")
    }
    println("Выигрышные числа: $listRandom")
}