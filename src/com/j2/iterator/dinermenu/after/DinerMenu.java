package com.j2.iterator.dinermenu.after;

public class DinerMenu implements Menu {
  static final int MAX_ITEMS = 5;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("채식 BLT", 
            "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    addItem("그냥 BLT",
            "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("오늘의 수프",
            "Soup of the day, with a side of potato salad", false, 3.29);
    
    addItem("스테이크 코스 메뉴", "Special Steak course menu with a fresh vegetables", false, 5.39);
    addItem("과일 소스 샐러드", "Salad dressed with fresh fruit sauce", true, 1.29);
  }
  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfItems >= MAX_ITEMS)
      System.out.println("Array full");
    else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems++;
    }
  }
  public MenuItem[] getMenuItems() { return menuItems; }
}