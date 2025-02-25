package PR9.entities;
import PR9.interfaces.*;

public class Book implements Nameble, Priceble{

    private String name;
    int price;
    String author;

    public Book(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    @Override
    public String toString() {
        return "Book {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}