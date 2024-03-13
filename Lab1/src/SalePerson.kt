class SalePerson: Employee() {
    var numberOfSales = 0
    override fun giveBonus(amount: Float){
        val salesBonus = when(numberOfSales){
            in 0..100 -> 10F
            in 101..200 -> 15F
            else -> 20F
        }
        // Использование кода функции родительского класса
        super.giveBonus(amount * salesBonus)
    }

    override fun displayStatus(){
        super.displayStatus()
        println("Объем продаж: $numberOfSales")
    }

}