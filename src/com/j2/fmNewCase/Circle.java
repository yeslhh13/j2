package com.j2.fmNewCase;

public class Circle extends Figure {
  FigureProperties properties;
  
  public Circle(FigureProperties properties) {
    this.properties = properties;
  }
  void resolve() {
    System.out.println("Resolving " + name);
    color = properties.resolveColor();
    type = properties.resolveType();
  }
}