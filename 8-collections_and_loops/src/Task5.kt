/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/

fun main() {
    val itDepartment = Department("IT", listOf<Employee>(Employee("Polina", 18), Employee("Kate", 25), Employee("Steve", 58)))
    val prDepartment = Department("PR", listOf<Employee>(Employee("Dane", 30), Employee("Rose", 21), Employee("Mike", 23)))

    val companyRedMadRobot = Company("RedMadRobot", listOf<Department>(itDepartment, prDepartment))

    println( totalNumberOfEmployees(companyRedMadRobot) )
    println( averageAgeOfEmployees(companyRedMadRobot) )

}

fun averageAgeOfEmployees(company: Company): Int {
    var sumAge = 0
    for (department in company.departments)
        for (employer in department.employees)
            sumAge += employer.age
    return sumAge / totalNumberOfEmployees(company)

}

fun totalNumberOfEmployees(company: Company): Int {
    var count = 0
    for (department in company.departments)
        count += department.employees.size
    return count
}
