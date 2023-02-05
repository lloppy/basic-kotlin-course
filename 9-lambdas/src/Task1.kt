/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    val users = listOf<User>(User("Polina", 18), User("Kate", 25), User("Steve", 58))

    val convert = convertToStrings(users) { "Name: ${it.name}, Age: ${it.age}" }
    println(convert)
}

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String> {
    val result = mutableListOf<String>()

    for (user in users) {
        val string = conversion(user)
        result.add(string)
    }
    return result
}
