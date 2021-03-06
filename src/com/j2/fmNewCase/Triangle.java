package com.j2.fmNewCase;

public class Triangle extends Figure {
  FigureProperties properties;
  
  public Triangle(FigureProperties properties) {
    this.properties = properties;
  }
  void resolve() {
    System.out.println("Resolving " + name);
    color = properties.resolveColor();
    type = properties.resolveType();
  }
}