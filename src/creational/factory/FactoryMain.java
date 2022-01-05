package creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        DeviceFactory deviceFactory=new DeviceFactory();

        //MusicPlayer musicPlayer = new GoogleAssistant();
        MusicPlayer musicPlayer=deviceFactory.getInstance("alexa");
        musicPlayer.play();
    }
}
