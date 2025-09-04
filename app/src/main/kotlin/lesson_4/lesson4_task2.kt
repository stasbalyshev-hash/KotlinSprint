package org.example.app.lesson_4

fun main() {
    val minAverage = 35
    val maxAverage = 100
    val value = 100
    val weight1 = 20
    val value1 = 80
    val weight2 = 50
    val value2 = 100
    val result1 = (weight1 > minAverage) && (weight1 <= maxAverage) && (value1 < value)
    val result2 = (weight2 > minAverage) && (weight2 <= maxAverage) && (value2 < value)

    println("Груз с весом $weight1 кг и объемом $value1 литров соответствует категории Average: $result1")
    println("Груз с весом $weight1 кг и объемом $value1 литров соответствует категории Average: $result2")
}