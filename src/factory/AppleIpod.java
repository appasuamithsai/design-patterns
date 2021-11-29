package factory;

public class AppleIpod implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Apple ipod is Playing Music for you...");
    }
}
