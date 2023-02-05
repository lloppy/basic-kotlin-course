/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val userList = listOf<Employee>(Employee("Polina", 18), Employee("Kate", 25), Employee("Steve", 58))
    println(minAge(userList))
}

fun minAge(userList: List<Employee>): Int {
    var minAge: Int = 100000
    for(user in userList)
        if(minAge > user.age)
            minAge = user.age
    return minAge
}