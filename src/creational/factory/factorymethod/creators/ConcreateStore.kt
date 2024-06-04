package creational.factory.factorymethod.creators

import creational.factory.factorymethod.products.CheesePizza
import creational.factory.factorymethod.products.PepperoniPizza
import creational.factory.factorymethod.products.Pizza

class PepperoniPizzaStore : PizzaStore() {
    override fun createPizza(): Pizza =
        PepperoniPizza()
}

class CheesePizzaStore : PizzaStore() {
    override fun createPizza(): Pizza =
        CheesePizza()
}