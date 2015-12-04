package com.j2.state.videoplayer;

public class VideoPlayer {
  State playState;
  State pauseState;
  State sleepState;
  
  State state = sleepState;
  
  public VideoPlayer() {
    playState = new PlayState(this);
    pauseState = new PauseState(this);
    sleepState = new SleepState(this);
    
    state = sleepState;
  }
  public void play() {
    state.play();
  }
  public void pause() {
    state.pause();
  }
  public void stop() {
    state.stop();
  }
  public void setState(State state) {
    this.state = state;
  }
  
  public State getState() {
    return state;
  }
  public State getPlayState() {
    return playState;
  }
  public State getPauseState() {
    return pauseState;
  }
  public State getSleepState() {
    return sleepState;
  }
  
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nYe-seul Video Player");
    result.append("\nVideo Player is " + getState() + "\n");
    return result.toString();
  }
}