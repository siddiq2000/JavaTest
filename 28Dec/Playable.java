public interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Play Football  START!!");
    }
}
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Play Volleyball  START!!");
    }
}
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Play Basketball  START!!");
    }
}
