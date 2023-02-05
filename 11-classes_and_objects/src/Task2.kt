/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/
fun main() {
    var round = Round(15.0)

    println(round.findLengthRound())
    println(round.findSquare())
}

class Round(val radius: Double) {

    fun findSquare(): Double {
        return Math.PI * radius * radius
    }

    fun findLengthRound(): Double {
        return 2 * Math.PI * radius
    }
}