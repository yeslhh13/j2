package com.j2.fmNewCase;

public class ThreeDimension extends FigureDimension {
  protected Figure createFigure(String item) {
    Figure figure = null;
    FigureProperties properties = new ThreeDimensionFigure();
    
    if (item.equals("circle")) {
      figure = new Circle(properties);
      figure.setName("3D style Circle");
    }
    else if (item.equals("triangle")) {
      figure = new Triangle(properties);
      figure.setName("3D style Triangle");
    }
    else if (item.equals("square")) {
      figure = new Square(properties);
      figure.setName("3D style Square");
    }
    return figure;
  }
}