package org.example.app.lesson_2

fun main() {
    val year = "1961"
    var hour = "09"
    var minute = "07"
    println("Takeoff time year: $year")
    println("Takeoff time hour: $hour")
    println("Takeoff time minute: $minute")
    hour = "10"
    minute = "55"
    print("Boarding time: " + "$hour:" + "$minute")
}