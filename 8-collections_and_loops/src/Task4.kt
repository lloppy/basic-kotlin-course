/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val employees = listOf<Employee>(Employee("Polina", 18), Employee("Kate", 25), Employee("Steve", 58))

    val departments = Department("nameOfDepartment", employees)
    println(findMiddleAge(departments))
}

fun findMiddleAge(department: Department): Int {
    var sumAge = 0
    for (employer in department.employees)
        sumAge += employer.age
    return sumAge / department.employees.size
}
