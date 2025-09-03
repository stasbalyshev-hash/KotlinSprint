package org.example.app.lesson_3

fun main() {
    val firstStep = "D2-D4;0"
    val start = firstStep.take(2)
    val end = firstStep.substring(3, 5)
    val step = firstStep[6]

    println("start with $start")
    println("end in $end")
    println("step number $step")
}