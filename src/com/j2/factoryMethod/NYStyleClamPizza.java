package com.j2.factoryMethod;

public class NYStyleClamPizza extends Pizza {
  public NYStyleClamPizza() { 
    name = "NY Style Clam Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
    
    toppings.add("Grated Reggiano Cheese");
    toppings.add("Fresh Clam from Long Island Sound");
  }
}