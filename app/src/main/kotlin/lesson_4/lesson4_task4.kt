package org.example.app.lesson_4

const val TRAINING_DAY = 8

fun main() {
    val isEven = TRAINING_DAY % 2 == 0

    println("Упражнения для рук: ${!isEven}\n"
            + "Упражнения для ног: $isEven\n"
            + "Упражнения для спины: $isEven\n"
            + "Упражнения для пресса: ${!isEven}\n")
}
