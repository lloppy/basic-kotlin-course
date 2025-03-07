/*
Проверить email на корректность ввода. Если email некорректен, то вывести об этом сообщение.
Обратите внимание, что в случае корректного email вообще ничего выводить не надо.
Корректным считается email если в нем присутствует символа @ и точка.
Проверить наличие символа в строке можно с помощью функции contains следующим образом: string.contains(‘@’),
где string – любая переменная типа String. Обратите внимание, что отдельные символы пишутся в одинарных кавычках,
тогда как строка пишется в двойных.

Например:
Если есть val text: String = “Forest”, тогда text.contains(‘e’) выдаст true, а !text.contains(‘e’)  выдаст false

Для этой задачи есть видео с разбором.
*/

fun main() {
    var email: String = readln()

    println(checkEmail(email))
}

fun checkEmail(email: String): Any? {
    return if (email.contains('@') && email.contains('.')) return true else "некорректен"
}
