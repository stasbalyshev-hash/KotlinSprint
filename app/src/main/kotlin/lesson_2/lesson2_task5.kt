package org.example.app.lesson_2

import java.time.LocalDate

fun main() {
    val seconds = 6480
    var minute = seconds / 60
    var hour = 0
    if (minute/60 > 0)
        hour++
        val minuteSpent: Int = minute % 60
        val secondsSpent: Int = minuteSpent / 60
    print("Time spent in space: " + "0$hour:" + "$minuteSpent:" + "0$secondsSpent")
}

