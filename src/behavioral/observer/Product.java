package behavioral.observer;

import java.util.ArrayList;

public class Product implements Subject{
    private ArrayList<Observer> observers=new ArrayList<>();
    private String productName;
    private String productType;
    private String productPrice;
    private String availability;

    public Product(String productName, String productType, String productPrice, String availability) {
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.availability = availability;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
        notifyObserver();
    }

    @Override
    public void registerCustomer(Observer observer) {
            observers.add(observer);
    }

    @Override
    public void removeCustomer(Observer observer) {
            observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println();
        System.out.println("Product Name : "+productName+", Product Type : "+productType+", Product price : "+productPrice
        +" is available now. So notifying all the users.");
        for(Observer observer:observers){
            observer.update(availability);
        }
    }
}
