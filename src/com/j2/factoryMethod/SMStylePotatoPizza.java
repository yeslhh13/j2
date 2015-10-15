package com.j2.factoryMethod;

public class SMStylePotatoPizza extends Pizza {
  public SMStylePotatoPizza() { 
    name = "Sang Myung Style Sauce and Potato Pizza";
    dough = "Normal size Crust Dough";
    sauce = "Teriyaki Sauce";
    
    toppings.add("Cheddar Cheese");
    toppings.add("Sliced Potato");
  }
}