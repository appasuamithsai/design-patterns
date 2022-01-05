package creational.abstractfactory.abstractfactorydesign;



public class SamsungPhonePack extends PhonePackFactory{
    @Override
    public Charger createCharger(String charger) {
        return new SamsungCharger();
    }

    @Override
    public Phone createPhone(String phone) {
        return new SamsungPhone();
    }
}
