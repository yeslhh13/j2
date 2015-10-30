package com.j2.singleton.chocothread;

public class ChocolateController {
  public static void main(String[] args) {
    ChocolateBoiler cb = ChocolateBoiler.getInstance();
    cb.fill();
    
    ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
    cb2.fill();
  }
}