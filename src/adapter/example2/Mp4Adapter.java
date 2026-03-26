package adapter.example2;

public class Mp4Adapter implements MediaPlayer {

    Mp4Player mp4Player;

    public Mp4Adapter(Mp4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String fileName) {
        mp4Player.playMp4(fileName);
    }
}
