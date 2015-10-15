package com.j2.fmNewCase;

public class Square extends Figure {
  FigureProperties properties;
  
  public Square(FigureProperties properties) {
    this.properties = properties;
  }
  void resolve() {
    System.out.println("Resolving " + name);
    color = properties.resolveColor();
    type = properties.resolveType();
  }
}