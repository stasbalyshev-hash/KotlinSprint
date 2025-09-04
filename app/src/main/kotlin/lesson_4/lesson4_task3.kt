package org.example.app.lesson_4

fun main() {
    val sunny: Boolean = true
    val openTent: Boolean = true
    val humidity = 20
    val year = "зима"
    val sunnyToday: Boolean = true
    val openTentToday: Boolean = true
    val humidityToday = 20
    val yearToday = "шум моря"
    val result = sunny == sunnyToday && openTent == openTentToday && humidity == humidityToday && !year.equals(yearToday)

    println("Благоприятные ли сейчас условия для роста бобовых: $result")
}