package org.example.app.lesson_2

fun main() {
    val crystal = 7
    val iron = 11
    val buff = 0.2
    val buffedCrystal = (crystal * buff).toInt()
    val buffedIron = (iron * buff).toInt()
    println("buffedCrystal: $buffedCrystal")
    println("buffedIron: $buffedIron")
}