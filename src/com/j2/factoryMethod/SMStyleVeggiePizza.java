package com.j2.factoryMethod;

public class SMStyleVeggiePizza extends Pizza {
  public SMStyleVeggiePizza() { 
    name = "Sang Myung Style Fresh Veggie Pizza";
    dough = "Normal size Crust Dough";
    sauce = "Teriyaki Sauce";
    
    toppings.add("Cheddar Cheese");
    toppings.add("Spinach");
    toppings.add("Onion");
    toppings.add("Black Olives");
  }
}