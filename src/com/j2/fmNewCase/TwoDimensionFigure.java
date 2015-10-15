package com.j2.fmNewCase;

public class TwoDimensionFigure implements FigureProperties {
  public Color resolveColor() {
    return new BlueColor();
  }
  public Type resolveType() {
    return new EmptyType();
  }
}