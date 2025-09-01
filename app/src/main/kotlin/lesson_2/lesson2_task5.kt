package org.example.app.lesson_2

import kotlin.math.pow

fun main() {
    val initialSum = 70000
    val rateOfInterest = 0.167
    val years = 20
    val amountOfDeposit: Double = (initialSum * (1+rateOfInterest).pow(years))
    println("The contribution amount in 20 years will be: ${"%.3f".format(amountOfDeposit)}")
}