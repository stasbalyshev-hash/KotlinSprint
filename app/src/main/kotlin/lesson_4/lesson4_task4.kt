package org.example.app.lesson_4

const val TRAINING_DAY = 5
const val STEP = 4 // шаг между 2 одинаковыми тренировками

fun main() {

    var handsPlusAbs = 1
    var backPlusLegs = 3


    println("Упражнения для рук: ${TRAINING_DAY % STEP == handsPlusAbs}\n"
            + "Упражнения для ног: ${TRAINING_DAY % STEP == backPlusLegs}\n"
            + "Упражнения для спины: ${TRAINING_DAY % STEP == backPlusLegs}\n"
            + "Упражнения для пресса: ${TRAINING_DAY % STEP == handsPlusAbs}\n")
}
