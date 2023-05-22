package com.ksvmediaplayer;

public class mp3audio {
    static String name;
    public mp3audio() {}
    mp3audio(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println(name+"(.mp3 audio) now playing.");
    }
}