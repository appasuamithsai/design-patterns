package creational.abstractfactory.factorydesign;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory=new PhoneFactory();
        ChargerFactory chargerFactory=new ChargerFactory();

        Phone phone=phoneFactory.createPhone("iphone");
        Charger charger=chargerFactory.createCharger("samsung");

        phone.show();
        charger.charging();
    }
}
