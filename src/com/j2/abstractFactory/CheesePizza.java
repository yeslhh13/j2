package com.j2.abstractFactory;

public class CheesePizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;
  
  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    name = "Cheese Pizza";
    this.ingredientFactory = if;
  }
  void prepare() {
    System.out.println("Preparing " + getName());
    dough = ingredientFactory.createDough();
    cheese = ingredientFactory.createCheese();
  }
}