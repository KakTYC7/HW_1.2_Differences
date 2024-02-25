import java.util.Scanner

fun main() {
    println("Введите сумму покупки: ")
    val price = Scanner(System.`in`).nextInt()
    println("Вы постоянный покупатель? Введите 'Да' или 'Нет'")
    val answer = readln()
    var discontedPrice = 0
    val constantCustomer = if (answer.lowercase() == "да") true else false
    if (price in 1..1000) {
        discontedPrice = if (constantCustomer) (price * 0.99).toInt() else price
        println("Стоимость покупки составляет: $discontedPrice рублей.")
    } else if (price in 1001..10_000) {
        discontedPrice = if (constantCustomer) ((price -100) * 0.99).toInt() else price - 100
        println("Стоимость покупки составляет: $discontedPrice рублей.")
    } else if (price in 10_001..Int.MAX_VALUE ){
        discontedPrice = if (constantCustomer) Math.round(((price * 0.95) * 0.99)).toInt() else (price * 0.95).toInt()
        println("Стоимость покупки составляет: $discontedPrice рублей.")
    }
}