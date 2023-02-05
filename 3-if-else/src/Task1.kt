import java.util.Collections.max

/* Вывести на экран большее из двух целых чисел. */

fun main(){
    var a: Int = readln().toInt()
    var b: Int = readln().toInt()

    var ans = kotlin.math.max(a, b)

    println(ans)
}


