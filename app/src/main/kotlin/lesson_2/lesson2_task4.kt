package org.example.app.lesson_2

const val PERCENT = 100

fun main() {
    val crystal = 7
    val iron = 11
    val buff = 20
    val buffedCrystal = (crystal * buff) / PERCENT
    val buffedIron = (iron * buff) / PERCENT

    println("buffedCrystal: $buffedCrystal")
    println("buffedIron: $buffedIron")
}