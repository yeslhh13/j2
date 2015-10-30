package com.j2.singleton.chocothread;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler instance;
  private static int numCalled = 0;
  
  private void ChocolateBoiler() {
    empty = true;
    boiled = true;
  }
  
  public static synchronized ChocolateBoiler getInstance() {
    if (instance == null) {
      System.out.println("Creating a new instance of Chocolate Boiler");
      instance = new ChocolateBoiler();
    }
    System.out.println("numCalled: " + numCalled++);
    return instance;
  }
  
  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
    }
  }
  
  public void boil() {
    if (isEmpty() && isBoiled()) {
      empty = false;
      boiled = false;
    }
  }
  
  public boolean isEmpty() {
    return empty;
  }
  
  public boolean isBoiled() {
    return boiled;
  }
}