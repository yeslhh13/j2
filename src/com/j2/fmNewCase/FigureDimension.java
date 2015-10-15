package com.j2.fmNewCase;

public abstract class FigureDimension {
  protected abstract Figure createFigure(String item);
  
  public Figure decideFigure(String type) {
    Figure figure = createFigure(type);
    System.out.println("--- Drawing a " + figure.getName() + " ---");
    figure.resolve();
    figure.pen();
    figure.draw();
    figure.finish();
    return figure;
  }
}