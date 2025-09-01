package org.example.app.lesson_2

import kotlin.math.pow

fun main() {
    val initialSum = 70000
    val rateOfInterest = 0.167
    val years = 20
    val amountOfDeposit: Double = (initialSum * (1+rateOfInterest).pow(years))
    print("The contribution amount in 20 years will be: ")
    println("%.3f".format(amountOfDeposit))
}