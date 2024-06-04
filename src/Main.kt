import creational.factory.factorymethod.creators.CheesePizzaStore
import creational.factory.factorymethod.creators.PepperoniPizzaStore

fun main() {
    val cheesePizzaStore = CheesePizzaStore().orderPizza()
    val pepperoniPizzaStore= PepperoniPizzaStore().orderPizza()
}