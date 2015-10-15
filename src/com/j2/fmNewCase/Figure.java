package com.j2.fmNewCase;

public abstract class Figure {
  String name;
  Color color;
  Type type;
  
  abstract void resolve();
  void pen() {
    System.out.println("Selecting Pen..");
  }
  void draw() {
    System.out.println("Drawing..");
  }
  void finish() {
    System.out.println("Finishing..");
  }
  void setName(String name) {
    this.name = name;
  }
  String getName() {
    return name;
  }
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append(name + "\n");
    if (color != null){
      result.append(color);
      result.append("\n");
    }
    if (type != null) {
      result.append(type);
      result.append("\n");
    }
    return result.toString();
  }
}