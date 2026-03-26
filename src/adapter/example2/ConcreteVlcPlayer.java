package adapter.example2;

public class ConcreteVlcPlayer implements VlcPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("VLC ::: playing file [" + fileName + "]");
    }
}
