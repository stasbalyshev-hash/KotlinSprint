package org.example.app.lesson_4

const val IS_SHIP_DAMAGE1 = false
const val COUNT_BOX_PROVISION1 = 50

const val IS_SHIP_DAMAGE2 = true
const val COUNT_OF_CREW2 = 70
const val COUNT_BOX_PROVISION2 = 50
const val IS_FAVORABLE_WEATHER2: Boolean = true

fun main() {
    val isShipDamageInput = readln().toBoolean()
    val countOfCrewInput = readln().toInt()
    val countBoxProvisionsInput = readln().toInt()
    val isFavorableWeatherInput = readln().toBoolean()
    val countOfCrew1 = 55..70
    val result1: Boolean = isShipDamageInput == IS_SHIP_DAMAGE1 &&
            countOfCrewInput in countOfCrew1 &&
            countBoxProvisionsInput > COUNT_BOX_PROVISION1
    val result2: Boolean = isShipDamageInput == IS_SHIP_DAMAGE2 &&
            countOfCrewInput == COUNT_OF_CREW2 &&
            countBoxProvisionsInput >= COUNT_BOX_PROVISION2 &&
            isFavorableWeatherInput == IS_FAVORABLE_WEATHER2

            println("Корабль может отправиться в плавание: ${result1 || result2}")
}