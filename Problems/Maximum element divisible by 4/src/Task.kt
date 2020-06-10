import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var max = 0
    var temp = 0
    repeat(scanner.nextInt()) {
        temp = scanner.nextInt()
        if (temp % 4 == 0 && temp > max) {max = temp}
    }
    println(max)


}