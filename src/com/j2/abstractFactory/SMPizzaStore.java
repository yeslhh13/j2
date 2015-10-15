package com.j2.abstractFactory;

public class SMPizzaStore extends PizzaStore {
  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new SMPizzaIngredientFactory();
    if(item.equlas("cheese")) {
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("Sang Myung Style Cheese Pizza");
    }
    return pizza;
  }
}