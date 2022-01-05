package creational.abstractfactory.abstractfactorydesign;



public abstract class PhonePackFactory {
    abstract public Charger createCharger(String charger);
    abstract  public Phone createPhone(String phone);

    public PhonePackFactory createPack(String str){
        if(str.equals("iphone")){
            return new IPhonePack();
        }else{
            return new SamsungPhonePack();
        }
    }

}
