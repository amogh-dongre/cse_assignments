/* import com.ksvmediaplayer.*;

class Main {
    public static void main(String[] args) {
        mp4video v1 = new mp4video("Ironman");
        mkvvideo v2 = new mkvvideo("Ironman");
        avivideo v3 = new avivideo("Ironman");
        mp3audio a1 = new mp3audio();
        wavaudio a2 = new wavaudio();
        v1.play();
        System.out.println();
        System.out.println("Converting Ironman.mp4 to .mkv: ");
        v1.format2format(".mkv");
        v2.play();
        System.out.println();
        System.out.println("Converting Ironman.mkv to .avi: ");
        v2.format2format(".avi");
        v3.play();
        System.out.println();
        System.out.println("Converting Ironman to audio: ");
        v3.video2audio();
        a1.play();
    }
} */

package com.ksvmediaplayer;

public interface Video {
    void play();
}
