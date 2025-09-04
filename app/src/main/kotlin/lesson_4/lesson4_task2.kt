package org.example.app.lesson_4

const val MIN_AVERAGE = 35
const val MAX_AVERAGE = 100
const val VALUE = 100

fun main() {
    val weight1 = 20
    val value1 = 80
    val weight2 = 50
    val value2 = 100
    val result1 = (weight1 > MIN_AVERAGE) && (weight1 <= MAX_AVERAGE) && (value1 < VALUE)
    val result2 = (weight2 > MIN_AVERAGE) && (weight2 <= MAX_AVERAGE) && (value2 < VALUE)

    println("Груз с весом $weight1 кг и объемом $value1 литров\n"
            + "соответствует категории Average: $result1")
    println("Груз с весом $weight2 кг и объемом $value2 литров\n"
            + "соответствует категории Average: $result2")
}