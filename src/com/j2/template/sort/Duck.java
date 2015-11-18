package com.j2.template.sort;

import java.util.Comparator;

public class Duck {
  String name;
  int weight;
  
  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
  
  public String toString() {
    return name + " weighs " + weight;
  }
  
  public int compareTo(Object object) {
    Duck otherDuck = (Duck)object;
    
    if (this.weight < otherDuck.weight)
      return -1;
    else if (this.weight == otherDuck.weight)
      return 0;
    else
      return 1;
  }
  
  public static Comparator DuckComparator = new Comparator() {
    public int compare(Object object1, Object object2) {
      Duck thisDuck = (Duck)object1;
      Duck otherDuck = (Duck)object2;
    
      return thisDuck.compareTo(otherDuck);
    }
  };
}