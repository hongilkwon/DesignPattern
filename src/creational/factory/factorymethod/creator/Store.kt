package creational.factory.factorymethod.creator

import creational.factory.factorymethod.product.Pizza


abstract class PizzaStore {

   // 어떤 피자던 주문하는 과정 및 포장 처리는 변함이 없다.
   fun orderPizza(): Pizza {
      val pizza = createPizza()
      pizza.prepare()
      return pizza
   }

   // Factory Method
   // 피자의 종류에 따라 실제 어떤 피자를 생성하여 반환 할지는 하위 클래스에서 결정하기로 한다.
   protected abstract fun createPizza(): Pizza
}