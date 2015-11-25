package com.j2.iterator.dinermenu.after;

public class DinerMenuIterator implements Iterator {
  MenuItem[] items;
  int position = 0;
  
  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }
  public boolean hasNext() {
    if (position >= items.length || items[position] == null)
      return false;
    else
      return true;
  }
  public Object next() {
    MenuItem item = items[position];
    position++;
    
    return item;
  }
}