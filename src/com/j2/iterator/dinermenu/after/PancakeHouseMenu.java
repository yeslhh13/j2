package com.j2.iterator.dinermenu.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
  ArrayList menuItems;
  
  public PancakeHouseMenu() {
    menuItems = new ArrayList();
    
    addItem("K&B의 아침 팬케이크", "Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("아침 팬케이크", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("블루베리 팬케이크", "Pancakes made with fresh blueberries", true, 3.49);
    addItem("와플", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    
    addItem("에그 머핀", "Muffin, with fried eggs and cheese", false, 2.79);
  }
  public Iterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }
  public ArrayList getMenuItems() { return menuItems; }
}