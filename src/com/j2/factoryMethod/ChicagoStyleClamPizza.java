package com.j2.factoryMethod;

public class ChicagoStyleClamPizza extends Pizza {
  public ChicagoStyleClamPizza() { 
    name = "Chicago Style Clam Pizza";
    dough = "Thick Crust Dough";
    sauce = "Tomato Sauce";
    
    toppings.add("Sheredded Mozzarella Cheese");
    toppings.add("Frozen Clams from Chesapeake Bay");
  }
}