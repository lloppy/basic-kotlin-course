/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

fun main() {
    val userPolina = User("Polina", 18, 0)
    val car = Car("BMW", 1500000)

    println(checkInfo(userPolina, car))

}

data class User(val name: String, val age: Int, val experience: Int)

data class Car(val brand: String, val price: Int)

fun checkInfo(user: User, car: Car): String {
    if (user.age >= 26 && user.experience >= 6) return "можете пользоваться каршерингом\n" +
            "доступные авто: Audi, BMW, лада гранта, лада калина, китайцы"

    if (user.age >= 21 && user.experience >= 2) return "можете пользоваться каршерингом\n" +
            "доступные авто: лада гранта, лада калина, китайцы"

    return "не можете пользоваться автомобилем"
}