package org.example.app.lesson_2

import java.time.LocalDate
const val part = 60 // кол-во секунд в минутах и минут в часах
fun main() {
    val seconds = 6480
    val minute = seconds / part
    var hour = 0
        hour++
        val minutesSpent = minute % part
        val secondsSpent = minutesSpent / part
        val hourSpent = String.format("0%d",hour)
        val secondsSpent1 = String.format("0%d",secondsSpent)
    println(hourSpent + ":" + minutesSpent + ":" + secondsSpent1)
}


