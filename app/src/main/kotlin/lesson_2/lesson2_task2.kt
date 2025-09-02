package org.example.app.lesson_2

fun main() {
    val oldWorkers = 50
    val salaryOldWorker = 30000
    val interns = 30
    val salaryOfInterns = 20000
    val totalSalaryOldWorkers = oldWorkers * salaryOldWorker  // подсчет расходов на выплаты постоянным сотрудникам
    val totalSalaryInterns = interns * salaryOfInterns // подсчет общей выплаты интернам
    val totalSalary = totalSalaryOldWorkers + totalSalaryInterns // подсчет общей суммы зарплат всех работников
    val averageSalary = totalSalary / (oldWorkers + interns) // подсчет средней зп после прихода стажеров

    println("Total salary costs for all workers: $totalSalary") // печать общей суммы зарплат всех работников
    println("The total salary of all old workers: $totalSalaryOldWorkers") // печать расходов на выплаты постоянным сотрудникам
    println("The average salary of one employee after the arrival of interns: $averageSalary") // печать средней зп после прихода стажеров
}