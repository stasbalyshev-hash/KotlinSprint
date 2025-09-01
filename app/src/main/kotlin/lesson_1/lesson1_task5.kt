package org.example.app.lesson_1

const val part = 60

fun main() {
    val seconds = 6480
    val minute = seconds / part
    var hour = 0
    hour++
    val minutesSpent = minute % part
    val secondsSpent = minutesSpent / part
    val hourSpent = String.format("0%d",hour)
    val secondsSpent1 = String.format("0%d",secondsSpent)

    println("Time spent in space: $hourSpent:$minutesSpent:$secondsSpent1")
}

