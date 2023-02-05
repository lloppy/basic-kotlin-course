/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.
Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    val users = listOf<User>(User("Polina", 18), User("Kate", 25), User("Steve", 58))

    val condition = containsElement(users){it.age > 24}
    val condition2 = containsElement(users){it.name[0] != 'S' }
    val condition3 = containsElement(users){it.name.last() == 'e'}

    println(condition)
    println(condition2)
    println(condition3)
}

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean {
    for(user in users)
        if(condition(user))
            return true
    return false
}
