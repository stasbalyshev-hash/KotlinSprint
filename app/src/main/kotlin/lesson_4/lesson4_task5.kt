package org.example.app.lesson_4

const val IS_SHIP_DAMAGE = false
const val COUNT_OF_CREW = 55
const val COUNT_OF_CREW_VARIABLE = 70
const val COUNT_BOX_PROVISION = 50
const val IS_FAVORABLE_WEATHER: Boolean = true

fun main() {
    val isShipDamageInput = readln().toBoolean()
    val countOfCrewInput = readln().toInt()
    val countBoxProvisionsInput = readln().toInt()
    val isFavorableWeatherInput = readln().toBoolean()
    val countOfCrew1 = COUNT_OF_CREW..COUNT_OF_CREW_VARIABLE
    val result1: Boolean = isShipDamageInput == IS_SHIP_DAMAGE &&
            countOfCrewInput in countOfCrew1 &&
            countBoxProvisionsInput > COUNT_BOX_PROVISION
    val result2: Boolean = isShipDamageInput == IS_SHIP_DAMAGE &&
            countOfCrewInput == COUNT_OF_CREW_VARIABLE &&
            countBoxProvisionsInput >= COUNT_BOX_PROVISION &&
            isFavorableWeatherInput == IS_FAVORABLE_WEATHER

    println("Корабль может отправиться в плавание: ${result1 || result2}")
}
