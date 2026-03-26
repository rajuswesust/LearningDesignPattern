package adapter.example2;

public class ConcreteMp4Player implements Mp4Player {

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4Player ::: " + fileName);
    }
}
