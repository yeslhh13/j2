package com.j2.abstractFactory;

public class PotatoPizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;
  
  public PotatoPizza(PizzaIngredientFactory ingredientFactory) {
    name = "Potato Pizza";
    this.ingredientFactory = ingredientFactory;
  }
  void prepare() {
    System.out.println("Preparing..");
    dough = ingredientFactory.createDough();
    potato = ingredientFactory.createPotato();
  }
}