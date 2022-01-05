package creational.abstractfactory.abstractfactorydesign;



public class IPhonePack extends PhonePackFactory{
    @Override
    public Charger createCharger(String charger) {
        return new IphoneCharger();
    }

    @Override
    public Phone createPhone(String phone) {
        return new Iphone();
    }
}
