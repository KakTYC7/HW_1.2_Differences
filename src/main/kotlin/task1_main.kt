import java.util.Scanner

fun main() {
    val COMMISSION = 0.75
    val COMMISSIONMINIMAL = 35
    println("Ведите сумму перевода в рублях")
    val amount: Int = Scanner(System.`in`).nextInt()
    val commissionValue: Double = amount/100 * COMMISSION
    val result = if (commissionValue > COMMISSIONMINIMAL) commissionValue else COMMISSIONMINIMAL
    println("Ваша комиссия составляет: $result")
}