import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    arr.sortDescending()
    if (arr.size == 1) print(arr[0]) else print(arr[0] * arr[1])   
}
