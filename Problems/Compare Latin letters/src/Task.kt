import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val c1 = scanner.next().first()
    val c2 = scanner.next().first()
    val test = c1.toUpperCase() == c2.toUpperCase()
    println(test)
}