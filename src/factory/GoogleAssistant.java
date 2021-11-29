package factory;

public class GoogleAssistant implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Google Assistant is Playing Music for you...");
    }
}
