package org.example.app.lesson_3

fun main() {
    val oldWorkers = 50
    val salaryOldWorker = 30000
    val interns = 30
    val salaryOfInterns = 20000
    val totalSalaryOldWorkers = oldWorkers * salaryOldWorker
    println("The total salary of all old workers: " + totalSalaryOldWorkers)
    println("Total salary costs for all workers: " + (totalSalaryOldWorkers + interns * salaryOfInterns))
    println("The average salary of one employee after the arrival of interns: " + (totalSalaryOldWorkers + interns * salaryOfInterns) / (oldWorkers + interns))
}