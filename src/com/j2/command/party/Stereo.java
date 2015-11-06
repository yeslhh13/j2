package com.j2.command.party;

public class Stereo {
  private String location;
  private int volume;
  
  public Stereo(String location) {
    this.location = location;
  }
  public void on() {
    volume = 30;
    System.out.println(this.location + " stereo is on");
  }
  public void off() {
    volume = 0;
    System.out.println(this.location + " stereo is off");
  }
  public void setVolume(int volume) {
    this.volume = volume;
    if (volume == 0)
      off();
    else
      System.out.println("Stereo volume is set to " + this.volume);
  }
  public int getVolume() {
    return this.volume;
  }
}