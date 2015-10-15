package com.j2.factoryMethod;

public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza() { 
    name = "Chicago Style Deep Dish Cheese Pizza";
    dough = "Thick Crust Dough";
    sauce = "Tomato Sauce";
    
    toppings.add("Sheredded Mozzarella Cheese");
  }
}