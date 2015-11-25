package com.j2.iterator.dinermenu.after;

import java.util.ArrayList;

public class Waitress {
  PancakeHouseMenu pancake = new PancakeHouseMenu();
  DinerMenu diner = new DinerMenu();
  
  public Waitress(PancakeHouseMenu pancake, DinerMenu diner) {
    this.pancake = pancake;
    this.diner = diner;
  }
  public void printMenu() {
    Iterator pancakeIterator = pancake.createIterator();
    Iterator dinerIterator = diner.createIterator();
    
    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(pancakeIterator);
    System.out.println("\nDINNER");
    printMenu(dinerIterator);
  }
  public void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem)iterator.next();
      System.out.println(menuItem.toString());
    }
  }
  public void printVegiMenu() {
    Iterator pancakeIterator = pancake.createIterator();
    Iterator dinerIterator = diner.createIterator();
    
    System.out.println("VEGETARIAN MENU\n----\nBREAKFAST");
    printVegiMenu(pancakeIterator);
    System.out.println("\nDINNER");
    printVegiMenu(dinerIterator);
  }
  public void printVegiMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem)iterator.next();
      if (menuItem.isVegetarian())
        System.out.println(menuItem.toString());
    }
  }
}