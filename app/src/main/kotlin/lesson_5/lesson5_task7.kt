package org.example.app.lesson_5

fun main() {
    println("Введите расстояние поездки в км: ")
    val travelDistance = readln().toFloat()
    println("Введите расход топлива вашего автомобиля на 100 км в литрах: ")
    val fuelRate = readln().toFloat()
    println("Введите текущую цену за 1л вашего топлива: ")
    val fuelCostPerLiter = readln().toFloat()
    val amountOfFuel = (travelDistance * fuelRate) / 100
    val totalCostOfFuel = amountOfFuel * fuelCostPerLiter

    println("Общее количество необходимого топлива для поездки равно: ")
    println("%.2f".format(amountOfFuel))
    println("Итоговая стоимость поездки равна: ")
    println("%.2f".format(totalCostOfFuel))
}
