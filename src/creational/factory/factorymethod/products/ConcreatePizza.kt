package creational.factory.factorymethod.products


class CheesePizza : Pizza() {

    override val name: String = "치즈 피자"
    override val dough: String = "씬 크러스트 도우"
    override val sauce: String = "마리나라 소스"

    init {
        toppings.add("잘게 썬 레지아노 치즈")
    }
}

class PepperoniPizza : Pizza() {

    override val name: String = "페퍼로니 치즈 피자"
    override val dough: String = "씬 크러스트 도우"
    override val sauce: String = "마리나라 소스"

    init {
        toppings.add("통 페퍼로니")
    }
}