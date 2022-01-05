package creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Library centralLibrary=new Library();
        centralLibrary.setLibName("Hyderabad Central Library");
        centralLibrary.loadBooks();

        Library mgLibrary=(Library) centralLibrary.clone();
        mgLibrary.setLibName("Mahatma Gandhi Library");

        centralLibrary.getBooks().remove(2);
        System.out.println(centralLibrary);
        System.out.println(mgLibrary);
    }
}
