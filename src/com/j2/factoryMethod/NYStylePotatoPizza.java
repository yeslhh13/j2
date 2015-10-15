package com.j2.factoryMethod;

public class NYStylePotatoPizza extends Pizza {
  public NYStylePotatoPizza() { 
    name = "NY Style Potato Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
    
    toppings.add("Grated Reggiano Cheese");
    toppings.add("Mashed Potato");
  }
}