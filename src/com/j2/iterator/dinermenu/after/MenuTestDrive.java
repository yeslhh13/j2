package com.j2.iterator.dinermenu.after;

public class MenuTestDrive {
  public static void main(String[] args) {
    PancakeHouseMenu pancake = new PancakeHouseMenu();
    DinerMenu diner = new DinerMenu();
    
    Waitress waitress = new Waitress(pancake, diner);
    waitress.printMenu();
    
    System.out.println("\n=====\n");
    waitress.printVegiMenu();
  }
}