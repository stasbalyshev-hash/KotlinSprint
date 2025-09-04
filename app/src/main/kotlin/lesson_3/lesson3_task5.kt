package org.example.app.lesson_3

fun main() {
    val firstStep = "D2-D4;0"
    val arr = firstStep.split("-",";")

    println("start with ${arr[0]}")
    println("end in ${arr[1]}")
    println("step number ${arr[2]}")
}