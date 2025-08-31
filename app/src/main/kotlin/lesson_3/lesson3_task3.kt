package org.example.app.lesson_3
    const val part = 60 // для перевода минут в часы
fun main() {
    val hoursDeparture: Int = 9
    val minutesDeparture: Int = 39
    val travelTime: Int = 457
    val generalMinutesDeparture = hoursDeparture * part + minutesDeparture + travelTime // считаем общее кол-во минут ( минуты текущего времени + минуты в пути)
    val arrivalHours = generalMinutesDeparture / part // считаем кол-во часов в конце пути
    val arrivalMinutes = generalMinutesDeparture % part // считаем кол-во минут в конце пути
    println("Train arrival time: " + "$arrivalHours:" + arrivalMinutes )
}