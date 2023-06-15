package com.ksvmediaplayer;
public class wmaaudio {
    static String name;
   public wmaaudio(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println(name+"(.wma audio) now playing.");
    }
}
