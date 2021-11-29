package factory;

public class DeviceFactory {
    public MusicPlayer getInstance(String str){
        if(str.equals("alexa")) {
            return new AmazonAlexa();
        }
        else if(str.equals("google")){
            return new GoogleAssistant();
        }else{
            return new AppleIpod();
        }
    }

}
