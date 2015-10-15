package com.j2.fmNewCase;

public class ThreeDimensionFigure implements FigureProperties {
  public Color resolveColor() {
    return new RedColor();
  }
  public Type resolveType() {
    return new FilledType();
  }
}