package com.ksvmediaplayer;

public class wavaudio {
    static String name;
    public wavaudio() {}
    wavaudio(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println(name+"(.wav audio) now playing.");
    }
}