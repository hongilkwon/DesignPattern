package creational.factory.factorymethod.product


abstract class Pizza {

    abstract val name: String
    abstract val dough: String
    abstract val sauce: String
    val toppings: MutableList<String> = mutableListOf()

    // Do Stuff
    fun prepare() {
        println("준비 중: $name")
        println("도우를 돌리는 중...")
        println("소스를 뿌리는 중...")
        println("토핑을 올리는 중...")
        toppings.forEach { topping ->
            println("$topping topping")
        }
        println("완성!")
    }
}