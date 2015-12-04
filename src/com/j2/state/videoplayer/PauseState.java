package com.j2.state.videoplayer;

public class PauseState implements State {
  VideoPlayer vp;
  
  public PauseState(VideoPlayer vp) {
    this.vp = vp;
  }
  public void play() {
    System.out.println("Video played again from where you paused");
    vp.setState(vp.getPlayState());
  }
  public void pause() {
    System.out.println("Video is already paused");
  }
  public void stop() {
    System.out.println("Video is stopped...");
    vp.setState(vp.getSleepState());
  }
  public String toString() {
    return "paused";
  }
}