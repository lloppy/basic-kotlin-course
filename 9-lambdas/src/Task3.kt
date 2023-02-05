/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    val users = listOf<User>(User("Polina", 18), User("Kate", 25), User("Steve", 58))

    val condition = elementsCount(users){it.age > 24}
    val condition2 = elementsCount(users){it.name[0] != 'S' }
    val condition3 = elementsCount(users){it.name.last() == 'e'}

    println(condition)
    println(condition2)
    println(condition3)
}

fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int {
    var result = 0
    for(user in users)
        if(condition(user))
            result+=1
    return result
}
