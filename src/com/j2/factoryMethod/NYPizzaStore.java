package com.j2.factoryMethod;

public class NYPizzaStore extends PizzaStore {
  protected Pizza createPizza(String item) {
    if (item.equals("cheese"))
      return new NYStyleCheesePizza();
    else if (item.equals("veggie")) 
      return new NYStyleVeggiePizza();
    else if (item.equals("clam"))
      return new NYStyleClamPizza();
    else if (item.equals("pepperoni"))
      return new NYStylePepperoniPizza();
    else if (item.equals("potato"))
      return new NYStylePotatoPizza();
    else
      return null;
  }
}