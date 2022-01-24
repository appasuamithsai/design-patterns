package behavioral.observer;

public class Customer implements Observer{
    private String customerName;

    public Customer(String customerName,Subject subject) {
        this.customerName = customerName;
        subject.registerCustomer(this);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void update(String availability){
        System.out.println("Hello "+customerName+", Product is now "+availability+" on Amazon");
    }

}
