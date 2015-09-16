package com.j2.wk2;

public class MallardDuck extends Duck{
  public MallardDuck(){
    quackBehavior = new Quack();
    flyBehavior = new FlywithWings();
  }
  public void display(){
    System.out.println("I'm a Mallard duck!");
  }
}