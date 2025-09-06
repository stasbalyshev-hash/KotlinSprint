package org.example.app.lesson_5

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {
    println("Пожалуйста, введите ваше имя: ")
    val inputUserName = readln()
    if (inputUserName == USER_NAME) {
        println("Пожалуйста введите пароль: ")
        val inputUserPassword = readln()
        if (inputUserPassword == USER_PASSWORD) {
            println("[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь \"Zaphod\", " +
                        "вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... " +
                        "Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] " +
                        "Надеюсь, вам понравится пребывание здесь больше, чем мне.")
        } else {
            println("К сожалению, вы ввели неверные данные")
        }
    } else {
        println("Пожалуйста зарегистрируйтесь и закончите процесс тут")
    }
}
