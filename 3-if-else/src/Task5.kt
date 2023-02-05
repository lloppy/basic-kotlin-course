/*
В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.


На вход приходит возраст и стаж водителя. Вывести сообщение о том, может ли он пользоваться каршерингом
и какие авто ему доступны.
*/

fun main() {
    var age: Int = readln().toInt()
    var experience: Int = readln().toInt()
    var category: String = readln()

    println(checkInfo(age, experience, category))
}

fun checkInfo(age: Int, experience: Int, category: String): String {
    if(category == "b")
        if (age >= 26 && experience >= 6) return "можете пользоваться каршерингом\n" +
                "доступные авто: Audi, BMW, лада гранта, лада калина, китайцы"

        if(age >= 21 && experience >= 2) return "можете пользоваться каршерингом\n" +
                "доступные авто: лада гранта, лада калина, китайцы"

    else return "не можете пользоваться автомобилем"
}
