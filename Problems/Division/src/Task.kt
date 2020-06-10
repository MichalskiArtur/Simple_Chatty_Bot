import java.util.*

fun divide(n1: Long, n2: Long) = n1.toDouble() / n2

/* Do not change code below */
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    println(divide(a, b))
}