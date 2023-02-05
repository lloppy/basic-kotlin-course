/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

fun main() {
    var rec = Rectangle(5,2)
    var square = Rectangle(5,5)

    println(rec.findPerimeter())
    println(rec.findSquare())
    println(rec.isSquare())

    println(square.isSquare())

}

class Rectangle(
    private val width: Int,
    private val height: Int
) {
    fun findSquare(): Int {
        return width * height
    }

    fun findPerimeter(): Int {
        return 2 * (width + height)
    }

    fun isSquare(): Boolean{
        return width==height
    }
}