package org.example.app.lesson_2

const val PART = 60

fun main() {
    val hoursDeparture = 9
    val minutesDeparture = 39
    val travelTime = 457
    val generalMinutesDeparture = hoursDeparture * PART + minutesDeparture + travelTime // считаем общее кол-во минут (минуты текущего времени + минуты в пути)
    val arrivalHours = generalMinutesDeparture / PART // считаем кол-во часов в конце пути
    val arrivalMinutes = generalMinutesDeparture % PART // считаем кол-во минут в конце пути

    println("Train arrival time: $arrivalHours:$arrivalMinutes")
}