import java.util.Scanner

fun main() {
    println("Введите количество лайков: ")
    val likes = Scanner(System.`in`).nextInt()
    if ((likes % 10 == 1 && likes % 100 != 11) || likes == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}
