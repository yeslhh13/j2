package com.j2.duck;

public class FlyNoWay implements FlyBehavior {
  public void fly() {
    System.out.println("I can't fly");
  }
}