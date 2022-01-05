package creational.abstractfactory.factorydesign;

public class PhoneFactory {
    public Phone createPhone(String phone){
        if(phone.equals("iphone")){
            return new Iphone();
        }else{
            return new SamsungPhone();
        }
    }
}
