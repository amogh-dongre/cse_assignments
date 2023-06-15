import com.ksvmediaplayer.mp4video;
import com.ksvmediaplayer.wavaudio;
import com.ksvmediaplayer.mkvvideo;
import com.ksvmediaplayer.avivideo;
import com.ksvmediaplayer.mp3audio;
class TestKSVMediaplayer {
    public static void main(String[] args) {
        mp4video v1 = new mp4video("Ironman");
        mkvvideo v2 = new mkvvideo("Ironman");
        avivideo v3 = new avivideo("Ironman");
        mp3audio a1 = new mp3audio("Batman");
        wavaudio a2 = new wavaudio("Superman");
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
}
