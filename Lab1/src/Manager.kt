class Manager: Employee() {
    var numberOfOptions: Int = 0

    override fun giveBonus(amount: Float){
        // Использование кода функции родительского класса
        super.giveBonus(amount)
        // Опционы на акции: увеличиваем их количество
        numberOfOptions += amount.toInt() * 10
    }

    override fun displayStatus(){
        super.displayStatus()
        println("Количество опционов: $numberOfOptions")
    }
}

