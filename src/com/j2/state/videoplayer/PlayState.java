package com.j2.state.videoplayer;

public class PlayState implements State {
  VideoPlayer vp;
  
  public PlayState(VideoPlayer vp) {
    this.vp = vp;
  }
  public void play() {
    System.out.println("Video is already playing");
  }
  public void pause() {
    System.out.println("Video is paused...");
    vp.setState(vp.getPauseState());
  }
  public void stop() {
    System.out.println("Video is stopped...");
    vp.setState(vp.getSleepState());
  }
  public String toString() {
    return "played";
  }
}