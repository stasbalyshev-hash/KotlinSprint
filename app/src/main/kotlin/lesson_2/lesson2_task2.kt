package org.example.app.lesson_2

fun main() {
    val oldWorkers = 50
    val salaryOldWorker = 30000
    val interns = 30
    val salaryOfInterns = 20000
    val totalSalaryOldWorkers = oldWorkers * salaryOldWorker
    val totalSalaryInterns = interns * salaryOfInterns
    val totalSalary = totalSalaryOldWorkers + totalSalaryInterns
    val averageSalary = (totalSalaryOldWorkers + totalSalaryInterns) / (oldWorkers + interns)

    println("The total salary of all old workers: $totalSalaryOldWorkers")
    println("Total salary costs for all workers: $totalSalary")
    println("The average salary of one employee after the arrival of interns: $averageSalary")
}
