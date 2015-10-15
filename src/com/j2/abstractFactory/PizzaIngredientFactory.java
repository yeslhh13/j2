package com.j2.abstractFactory;

public interface PizzaIngredientFactory {
  public Dough createDough();
  public Cheese createCheese();
  public Potato createPotato();
}