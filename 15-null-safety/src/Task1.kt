/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {
    val employeeList = listOf<SomeEmployee>(SomeEmployee("Polina", 200), SomeEmployee("Karol", 100), SomeEmployee("Steve", 150))
    val employee = findEmployeeBySalary(employeeList, 100)

    println(employee?.callToClient("SomeClient"))
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee?{
    for(employee in employees)
        if(employee.salary == salary)
            return employee
    return null
}

class SomeEmployee(
    val name: String,
    val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

