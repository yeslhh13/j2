package com.j2.iterator.dinermenu.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
  ArrayList menuItems;
  
  public PancakeHouseMenu() {
    menuItems = new ArrayList();
    
    addItem("K&B�� ��ħ ������ũ", "Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("��ħ ������ũ", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("��纣�� ������ũ", "Pancakes made with fresh blueberries", true, 3.49);
    addItem("����", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    
    addItem("���� ����", "Muffin, with fried eggs and cheese", false, 2.79);
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