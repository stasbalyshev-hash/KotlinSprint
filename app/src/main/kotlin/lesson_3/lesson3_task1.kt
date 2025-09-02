package org.example.app.lesson_3

fun main() {
    val name = "Ivan"
    val greeting = "Hello"
    val timeOfDay = "Good morning"

    println("$greeting, $name! $timeOfDay!")

    val timeOfDay1 = timeOfDay.replace("Good morning","Good evening" )

    println("$greeting, $name! $timeOfDay1!")
}