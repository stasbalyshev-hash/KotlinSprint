package org.example.app.lesson_2
const val percent = 100
fun main() {
    val crystal = 7
    val iron = 11
    val buff = 20
    val buffedCrystal = (crystal * buff) / percent
    val buffedIron = (iron * buff) / percent

    println("buffedCrystal: $buffedCrystal")
    println("buffedIron: $buffedIron")
}