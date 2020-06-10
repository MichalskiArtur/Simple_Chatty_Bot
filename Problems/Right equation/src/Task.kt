import java.util.*

fun isRightEquation(n1: Int, n2: Int, n3: Int) = n1 * n2 == n3

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(isRightEquation(a, b, c))
}