open class Employee {
    var empId = 0 // Идентификатор
    var fullName = "" // Имя Фамилия
    var currPay = 0f // Зар. плата

    open fun giveBonus(amount: Float){
        currPay += amount
    }
    open fun displayStatus(){
        println("Код: $empId")
        println("ФИО: $fullName")
        println("Зарплата: $currPay")
    }
}
