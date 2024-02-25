import java.util.Scanner

fun main() {
    println("Введите количество лайков: ")
    val likes = Scanner(System.`in`).nextInt()
    if (likes % 2 == 1 && likes != 11) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}
