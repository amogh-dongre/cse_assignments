package com.ksvmediaplayer;
public class mkvvideo implements Video, ConvertF2F, ConvertV2A {
    static String name;
   public mkvvideo(String name) {
       this.name = name;
    }
    public void play() {
        System.out.println(name+"(.mkv video) now playing.");
    }
    public void format2format(String s) {
        if (s == ".mp4") {
            mp4video.name = name;
        }
        else if (s == ".avi") {
            avivideo.name = name;
        }
        else System.out.println("Enter appropriate types only. [.mp4 or .avi]");
    }
    public void video2audio() {
        System.out.println("Note: Default audio type is .mp3");
        mp3audio.name = name;
    }
}
