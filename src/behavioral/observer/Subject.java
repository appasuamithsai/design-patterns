package behavioral.observer;

public interface Subject {
    public void registerCustomer(Observer observer);
    public void removeCustomer(Observer observer);
    public void notifyObserver();
}
