/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */

fun main() {
    var a: Int = readln().toInt()
    var b: Int = readln().toInt()

    println(compareInt(a, b))
}

fun compareInt(a: Int, b: Int): String {
    if (a > b) return "первое число больше"
    if (a < b) return "второе число больше"
    return "числа равны"
}