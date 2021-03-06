package com.j2.abstractFactory;

public class CheesePizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;
  
  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    name = "Cheese Pizza";
    this.ingredientFactory = ingredientFactory;
  }
  void prepare() {
    System.out.println("Preparing..");
    dough = ingredientFactory.createDough();
    cheese = ingredientFactory.createCheese();
  }
}