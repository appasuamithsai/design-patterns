package creational.abstractfactory.factorydesign;

public class ChargerFactory {
    public Charger createCharger(String charger){
        if(charger.equals("iphone")){
            return new IphoneCharger();
        }else{
            return new SamsungCharger();
        }
    }
}
