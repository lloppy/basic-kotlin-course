/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val buyer18 = User("Polina", 18, 0)
    val buyer50 = User("Yaroslav", 50, 40)

    val carsList = listOf<Car>(Car("Nissan", "Altima", 100.0), Car("Toyota", "Corolla",150.0), Car("Volkswagen", "Golf", 200.0))
    println(checkAvailableCars(buyer18, carsList))
    println(checkAvailableCars(buyer50, carsList))
}

fun checkAvailableCars(user: User, carsList: List<Car>): String {
    if (user.age >= 26 && user.experience >= 6) {
        var newCars: String = ""
        for (car in carsList)
            newCars += ", ${car.brand}"
        return "можете пользоваться каршерингом\n" +
                "доступные авто: лада гранта, лада калина, китайцы" + newCars
    }

    if(user.age >= 21 && user.experience >= 2) return "можете пользоваться каршерингом\n" +
            "доступные авто: лада гранта, лада калина, китайцы"

    else return "не можете пользоваться автомобилем"
}