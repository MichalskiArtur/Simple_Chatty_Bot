import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val cups = scanner.nextInt()
    val weekend = scanner.nextBoolean()
    println(!weekend && cups in 10..20 || weekend && cups in 15..25)    
}
