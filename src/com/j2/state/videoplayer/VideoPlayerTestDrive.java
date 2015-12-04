package com.j2.state.videoplayer;

public class VideoPlayerTestDrive {
  public static void main(String[] args) {
    VideoPlayer vp = new VideoPlayer();
    
    System.out.println(vp);
    
    vp.play();
    vp.pause();
    
    System.out.println(vp);
    
    vp.stop();
    vp.pause();
    vp.play();
    vp.play();
    
    System.out.println(vp);
  }
}