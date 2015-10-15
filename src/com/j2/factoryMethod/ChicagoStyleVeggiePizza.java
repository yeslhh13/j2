package com.j2.factoryMethod;

public class ChicagoStyleVeggiePizza extends Pizza {
  public ChicagoStyleVeggiePizza() { 
    name = "Chicago Style Deep Dish Veggie Pizza";
    dough = "Thick Crust Dough";
    sauce = "Tomato Sauce";
    
    toppings.add("Sheredded Mozzarella Cheese");
    toppings.add("Black Olives");
    toppings.add("Spinach");
    toppings.add("Eggplant");
  }
}