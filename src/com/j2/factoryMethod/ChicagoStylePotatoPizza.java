package com.j2.factoryMethod;

public class ChicagoStylePotatoPizza extends Pizza {
  public ChicagoStylePotatoPizza() { 
    name = "Chicago Style Potato Pizza";
    dough = "Thick Crust Dough";
    sauce = "Tomato Sauce";
    
    toppings.add("Sheredded Mozzarella Cheese");
    toppings.add("Sliced Potato");
  }
}