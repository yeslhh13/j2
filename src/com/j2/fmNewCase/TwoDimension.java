package com.j2.fmNewCase;

public class TwoDimension extends FigureDimension {
  protected Figure createFigure(String item) {
    Figure figure = null;
    FigureProperties properties = new TwoDimensionFigure();
    
    if (item.equals("circle")) {
      figure = new Circle(properties);
      figure.setName("2D style Circle");
    }
    else if (item.equals("triangle")) {
      figure = new Triangle(properties);
      figure.setName("2D style Triangle");
    }
    else if (item.equals("square")) {
      figure = new Square(properties);
      figure.setName("2D style Square");
    }
    return figure;
  }
}