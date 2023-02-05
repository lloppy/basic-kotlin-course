import java.awt.Rectangle
import kotlin.math.sqrt

/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
    val movableObjects = listOf<Movable>(
        Animal("Kitty", 1,1),
        Animal("Doggy", 2, 2),
        Triangle("Blue", 3.0, 3.0, 3.0)
        )

    for (obj in movableObjects)
        obj.moveRight(10)
}

class Triangle(color: String, val a: Double, val b: Double, val c: Double): Figure(color){
    override fun area(): Double {
        val p=(a+b+c)/2
        return sqrt(p*(p-a)*(p-b)*(p-c))
    }

    override fun length(): Double {
        return a+b+c
    }
}

