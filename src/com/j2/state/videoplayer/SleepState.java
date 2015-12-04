package com.j2.state.videoplayer;

public class SleepState implements State {
  VideoPlayer vp;
  
  public SleepState(VideoPlayer vp) {
    this.vp = vp;
  }
  public void play() {
    System.out.println("Video played...");
    vp.setState(vp.getPlayState());
  }
  public void pause() {
    System.out.println("Video is in sleep state, you can't pause");
  }
  public void stop() {
    System.out.println("Video is stopped...");
  }
  public String toString() {
    return "sleeping";
  }
}