/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {
    try {
        val employeeList = listOf<SomeEmployee>(SomeEmployee("Polina", 200), SomeEmployee("Karol", 100), SomeEmployee("Steve", 150))
        val employee = findEmployeeBySalary(employeeList, 666)
    }catch (e : Exception){
        println(e.message)
    }

}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee {
    for (employee in employees)
        if (employee.salary == salary)
            return employee
    throw Exception("Сотрудника с зарплатой $salary не найдено")
}

class SomeEmployee(
        val name: String,
        val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}