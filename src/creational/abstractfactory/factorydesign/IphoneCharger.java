package creational.abstractfactory.factorydesign;

public class IphoneCharger implements Charger{
    @Override
    public void charging() {
        System.out.println("This is IPhone Charge");
    }
}
