package org.example.app.lesson_2

const val PART = 60

fun main() {
    val hoursDeparture = 9
    val minutesDeparture = 39
    val travelTime = 457
    val generalMinutesDeparture = hoursDeparture * PART + minutesDeparture + travelTime
    val arrivalHours = generalMinutesDeparture / PART
    val arrivalMinutes = generalMinutesDeparture % PART

    println("%02d:%02d".format(arrivalHours,arrivalMinutes))
}