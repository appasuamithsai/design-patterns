package creational.abstractfactory.abstractfactorydesign;


public class SamsungCharger implements Charger {
    @Override
    public void charging() {
        System.out.println("This is Samsung Charge");
    }
}
