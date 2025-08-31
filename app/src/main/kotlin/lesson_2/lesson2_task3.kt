package org.example.app.lesson_2

fun main() {
    val year = "1961"
    var hour = "9"
    var minute = "7"
    println("Takeoff time year: $year")
    println("Takeoff time hour: $hour")
    println("Takeoff time minute: $minute")
    hour = "10"
    minute = "55"
    print("Boarding time: " + "$hour:" + "$minute")
}