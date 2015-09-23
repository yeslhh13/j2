package com.j2.first;

public class test {
  public static void main(String[] args) {
    System.out.println("Problem 2. --------------------------------");
    MallardDuck duck = new MallardDuck();
    duck.quack();
    
    WildTurkey turkey = new WildTurkey();
    turkey.gobble();
    turkey.fly();
    
    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    turkeyAdapter.quack();
    System.out.println("--------------------------------------------");
  }
}