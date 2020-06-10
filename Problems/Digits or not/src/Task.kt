import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val ch1 = scanner.next().first().isDigit()
    val ch2 = scanner.next().first().isDigit()
    val ch3 = scanner.next().first().isDigit()
    val ch4 = scanner.next().first().isDigit()

    println("$ch1\\$ch2\\$ch3\\$ch4")
}