package org.example.app.lesson_4

const val IS_SUNNY: Boolean = true
const val IS_OPEN_TENT: Boolean = true
const val HUMIDITY = 20
const val SEASON = "зима"

fun main() {

    val isSunnyToday: Boolean = true
    val isOpenTentToday: Boolean = true
    val humidityToday = 20
    val seasonYearToday = "зима"
    val result = IS_SUNNY == isSunnyToday &&
            IS_OPEN_TENT == isOpenTentToday &&
            HUMIDITY == humidityToday &&
            SEASON != seasonYearToday

    println("Благоприятные ли сейчас условия для роста бобовых: $result")
}