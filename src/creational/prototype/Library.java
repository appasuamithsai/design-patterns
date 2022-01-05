package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Library implements Cloneable{
    private String libName;
    private List<Book> books=new ArrayList<>();

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks(){
        for(int i=1;i<=10;i++) {
            Book b=new Book();
            b.setBookId(i);
            b.setBookName("Book "+i);
            getBooks().add(b);
        }
    }


    @Override
    public String toString() {
        return "Library{" +
                "libName='" + libName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected Library clone() throws CloneNotSupportedException {
        Library library=new Library();

        for(Book b:this.getBooks()){
            library.getBooks().add(b);
        }

        return library;
    }
}
