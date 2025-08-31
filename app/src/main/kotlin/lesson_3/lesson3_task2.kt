package org.example.app.lesson_3

fun main() {
    val oldWorkers = 50
    val salaryOldWorker = 30000
    val interns = 30
    val salaryOfInterns = 20000
    println("The total salary of all old workers: " + oldWorkers * salaryOldWorker)
    println("Total salary costs for all workers: " + (oldWorkers * salaryOldWorker + interns * salaryOfInterns))
    println("The average salary of one employee after the arrival of interns: " + (oldWorkers * salaryOldWorker + interns * salaryOfInterns) / (oldWorkers + interns))
}