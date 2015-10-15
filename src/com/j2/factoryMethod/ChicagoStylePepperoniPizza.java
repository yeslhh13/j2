package com.j2.factoryMethod;

public class ChicagoStylePepperoniPizza extends Pizza {
  public ChicagoStylePepperoniPizza() { 
    name = "Chicago Style Pepperoni Pizza";
    dough = "Thick Crust Dough";
    sauce = "Tomato Sauce";
    
    toppings.add("Sheredded Mozzarella Cheese");
    toppings.add("Black Olives");
    toppings.add("Spinach");
    toppings.add("Eggplant");
    toppings.add("Sliced Pepperoni");
  }
}