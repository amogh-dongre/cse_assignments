package com.ksvmediaplayer;

public class mp4video implements Video, ConvertF2F, ConvertV2A {
    static String name;
    public mp4video(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name+"(.mp4 video) now playing.");
    }
    public void format2format(String s) {
        if (s == ".mkv") {
            mkvvideo.name = name;
        }
        else if (s == ".avi") {
            avivideo.name = name;
        }
        else System.out.println("Enter appropriate types only. [.mkv or .avi]");
    }
    public void video2audio() {
        System.out.println("Note: Default audio type is .mp3");
        mp3audio.name = name;
    }
}