package com.j2.iterator.dinermenu.after;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
  ArrayList items;
  int position = 0;
  
  public PancakeHouseMenuIterator(ArrayList items) {
    this.items = items;
  }
  public boolean hasNext() {
    if (position >= items.size())
      return false;
    else
      return true;
  }
  public Object next() {
    Object item = (Object)items.get(position);
    position++;
    return item;
  }
}