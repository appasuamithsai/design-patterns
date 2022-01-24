package behavioral.observer;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product lgOLEDTV=new Product("LG OLED TV","OLED TV","80000₹","Not available");

        Customer ram=new Customer("Ram",lgOLEDTV);
        Customer sham=new Customer("Sham",lgOLEDTV);

        ArrayList<Observer> subscribers=lgOLEDTV.getObservers();

        System.out.println("Subscribers are : ");
        int count=0;
        for(Observer observer:subscribers){
            Customer customer =(Customer) observer;
            count++;
            System.out.println("Subscriber " + count +" : "+customer.getCustomerName());
        }
        System.out.println("Lg OLED TV current state "+lgOLEDTV.getAvailability());
        System.out.println();
        lgOLEDTV.setAvailability("Available");
//        lgOLEDTV.removeCustomer(sham);
//
//        lgOLEDTV.setAvailability("Available");
    }
}
