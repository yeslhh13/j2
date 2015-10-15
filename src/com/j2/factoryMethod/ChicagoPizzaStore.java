package com.j2.factoryMethod;

public class ChicagoPizzaStore extends PizzaStore {
  protected Pizza createPizza(String item) {
    if (item.equals("cheese"))
      return new ChicagoStyleCheesePizza();
    else if (item.equals("veggie")) 
      return new ChicagoStyleVeggiePizza();
    else if (item.equals("clam"))
      return new ChicagoStyleClamPizza();
    else if (item.equals("pepperoni"))
      return new ChicagoStylePepperoniPizza();
    else if (item.equals("potato"))
      return new ChicagoStylePotatoPizza();
    else
      return null;
  }
}