package com.j2.abstractFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    public Potato createPotato() {
      return new SlicedPotato();
    }
}