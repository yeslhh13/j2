package com.j2.iterator.dinermenu.after;

public class MenuItem {
  String name;
  String description;
  boolean vegetarian;
  double price;
  
  public MenuItem(String name, String description, boolean vegetarian, double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }
  public String geteName() { return this.name; }
  public String getDescription() { return this.description; }
  public double getPrice() { return this.price; }
  public boolean isVegetarian() { return this.vegetarian; }
  
  public String toString() {
    return name + ", $" + getPrice() + ", " + getDescription();
  }
}