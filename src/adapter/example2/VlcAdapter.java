package adapter.example2;

public class VlcAdapter implements MediaPlayer {
    VlcPlayer vlcPlayer;

    public VlcAdapter(VlcPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(String fileName) {
        vlcPlayer.playVlc(fileName);
    }
}
