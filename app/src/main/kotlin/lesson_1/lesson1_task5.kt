package org.example.app.lesson_1

const val PART = 60

fun main() {
    val seconds = 6480
    val minute = seconds / PART
    val hour = minute / PART
    val minutesSpent = minute % PART
    val secondsSpent = minutesSpent / PART

    println("%02d:%02d:%02d".format(hour, minutesSpent, secondsSpent))
}

