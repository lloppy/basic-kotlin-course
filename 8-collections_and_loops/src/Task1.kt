/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает средний возраст всех пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val userList = listOf<Employee>(Employee("Polina", 18), Employee("Kate", 25), Employee("Steve", 58))
    println(middleAge(userList))
}

fun middleAge(userList: List<Employee>): Int {
    var sumAge: Int = 0
    for(user in userList)
        sumAge += user.age

    return sumAge / userList.size
}