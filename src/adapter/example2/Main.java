package adapter.example2;

public class Main {

    static String fileName = "let-her-go.mp4";

    public static void main(String[] args) {

        ConcreteVlcPlayer vlcPlayer = new ConcreteVlcPlayer();
        //vlcPlayer.playVlc(fileName);

        ConcreteMp4Player mp4Player = new ConcreteMp4Player();
        //mp4Player.playMp4(fileName);

        MediaPlayer player1 = new VlcAdapter(vlcPlayer);
        MediaPlayer player2 = new Mp4Adapter(mp4Player);

        playSomething(player1);
        playSomething(player2);
    }

    static void playSomething(MediaPlayer mediaPlayer) {
        mediaPlayer.play(fileName);
    }
}
