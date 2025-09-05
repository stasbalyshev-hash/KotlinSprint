package org.example.app.lesson_4

const val TABLE = 13

fun main() {
    val bookedTableToday = 13
    val bookedTableTomorrow = 9

    println("Availability of tables for today: ${bookedTableToday < TABLE}")
    println("Availability of tables for tomorrow: ${bookedTableTomorrow < TABLE}")
}