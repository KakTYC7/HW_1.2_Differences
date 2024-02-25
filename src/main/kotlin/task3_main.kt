import java.util.Scanner

fun main() {
    println("Введите сумму покупки: ")
    val price = Scanner(System.`in`).nextInt()
    println("Вы постоянный покупатель? Введите 'Да' или 'Нет'")
    val answer = readln()
    val constantCustomer = answer.lowercase() == "да"
    when (price) {
        in 1..1000 -> {
            val discontedPrice = if (constantCustomer) (price * 0.99).toInt() else price
            println("Стоимость покупки составляет: $discontedPrice рублей.")
        }
        in 1001..10_000 -> {
            val discontedPrice = if (constantCustomer) ((price -100) * 0.99).toInt() else price - 100
            println("Стоимость покупки составляет: $discontedPrice рублей.")
        }
        in 10_001..Int.MAX_VALUE -> {
            val discontedPrice = if (constantCustomer) Math.round(((price * 0.95) * 0.99)).toInt() else (price * 0.95).toInt()
            println("Стоимость покупки составляет: $discontedPrice рублей.")
        }
    }
}
