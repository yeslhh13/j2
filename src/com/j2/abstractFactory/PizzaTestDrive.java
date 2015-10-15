package com.j2.abstractFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore smStore = new SMPizzaStore();
 
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.toString() + "\n");
 
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.toString() + "\n");
        
        pizza = smStore.orderPizza("cheese");
        System.out.println("Ye-seul ordered a " + pizza.toString() + "\n");
        
        pizza = smStore.orderPizza("potato");
        System.out.println("Katherine ordered a " + pizza.toString() + "\n");
 }
}