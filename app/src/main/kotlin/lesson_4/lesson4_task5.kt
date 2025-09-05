package org.example.app.lesson_4

fun main() {

    val isShipDamageInput = readLine().toBoolean()
    val countOfCrewInput = readLine()?.toInt()
    val countBoxProvisionsInput = readLine()?.toInt()
    val isFavorableWeatherInput = readLine().toBoolean()

    val isShipDamage1 = false
    val countOfCrew1 = 55..70
    val countBoxProvisions1 = 50


    val isShipDamage2 = true
    val countOfCrew2 = 70
    val countBoxProvisions2 = 50
    val isFavorableWeather2: Boolean = true

    val result1 = isShipDamageInput == isShipDamage1 &&
            countOfCrewInput in countOfCrew1 &&
            countBoxProvisionsInput!! > countBoxProvisions1

    val result2:Boolean = isShipDamageInput == isShipDamage2 &&
            countOfCrewInput == countOfCrew2 &&
            countBoxProvisionsInput!! >= countBoxProvisions2 &&
            isFavorableWeatherInput == isFavorableWeather2

            println("Корабль может отправиться в плавание: ${result1 || result2}")
}