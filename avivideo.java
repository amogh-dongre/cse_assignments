package com.ksvmediaplayer;

public class avivideo implements Video, ConvertF2F, ConvertV2A {
    static String name;
    public avivideo(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println(name+"(.avi video) now playing.");
    }
    public void format2format(String s) {
        if (s == ".mkv") {
            mkvvideo.name = name;
        }
        else if (s == ".mp4") {
            mp4video.name = name;
        }
        else System.out.println("Enter appropriate types only. [.mkv or .mp4]");
    }
    public void video2audio() {
        System.out.println("Note: Default audio type is .mp3");
        mp3audio.name = name;
    }
}