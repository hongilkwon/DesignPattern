package creational.factory.factorymethod.creator

import creational.factory.factorymethod.product.CheesePizza
import creational.factory.factorymethod.product.PepperoniPizza
import creational.factory.factorymethod.product.Pizza

class PepperoniPizzaStore : PizzaStore() {
    override fun createPizza(): Pizza =
        PepperoniPizza()
}

class CheesePizzaStore : PizzaStore() {
    override fun createPizza(): Pizza =
        CheesePizza()
}