import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var temp = 0
    var min = 0
    for (i in 1..scanner.nextLine().toInt()) {
        temp = scanner.nextInt()
        if (i == 1) { min = temp }
        if (temp < min) { min = temp }
    }
    println(min)
}
