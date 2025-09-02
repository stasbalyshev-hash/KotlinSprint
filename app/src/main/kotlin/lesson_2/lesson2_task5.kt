package org.example.app.lesson_2

import kotlin.math.pow

const val PERCENT = 100

fun main() {
    val initialSum = 70000
    val rateOfInterest = 16.7
    val years = 20
    val amountOfDeposit = initialSum * ((1 + (rateOfInterest / PERCENT)).pow(years))

    println("The contribution amount in 20 years will be: ${"%.3f".format(amountOfDeposit)}")
}