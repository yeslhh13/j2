package com.j2.command.undoRemote;

public class DVD {
  private int point;
  
  public DVD() {}
  public void play() {
    point = 100;
    System.out.println("DVD is played");
  }
  public void stop() {
    point = 0;
    System.out.println("DVD is stoped");
  }
  public void wind(int point) {
    this.point = point;
    if (point == 0)
      stop();
    else
      System.out.println("DVD is winded to " + this.point + "%");
  }
  public int getPoint() {
    return this.point;
  }
}