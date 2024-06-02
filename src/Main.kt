import creational.factory.factorymethod.creator.CheesePizzaStore
import creational.factory.factorymethod.creator.PepperoniPizzaStore

fun main() {
    val cheesePizzaStore = CheesePizzaStore().orderPizza()
    val pepperoniPizzaStore= PepperoniPizzaStore().orderPizza()
}