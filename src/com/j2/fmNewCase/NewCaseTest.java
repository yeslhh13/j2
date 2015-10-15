package com.j2.fmNewCase;

public class NewCaseTest {
  public static void main(String[] args) {
    FigureDimension two = new TwoDimension();
    FigureDimension three = new ThreeDimension();
    
    Figure figure = two.decideFigure("circle");
    System.out.println("Ye-seul draw a " + figure + "\n");
    
    figure = three.decideFigure("triangle");
    System.out.println("Katherine draw a " + figure + "\n");
    
    figure = two.decideFigure("square");
    System.out.println("Marie draw a " + figure + "\n");
  }
}