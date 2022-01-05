package creational.factory;

public class AmazonAlexa implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Amazon Alexa is Playing Music for you...");
    }
}
