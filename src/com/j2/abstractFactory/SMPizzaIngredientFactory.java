package com.j2.abstractFactory;

public class SMPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new NormalDough();
  }
  public Cheese createCheese() {
    return new CheddarCheese();
  }
}