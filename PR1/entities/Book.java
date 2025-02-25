package PR1.entities;

public class Book {
    private String name;
    private int pagesNumber;
    public Book(String n, int a){
        name = n;
        pagesNumber = a;
    }
    public Book(String n){
        name = n;
        pagesNumber =  999;
    }
    public Book(){
        name = "Harry Potter (standard)";
        pagesNumber = 999;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPagesNumber(int pagesNumber){
        this.pagesNumber = pagesNumber;
    }
    public int getPagesNumber(){
        return pagesNumber;
    }
    public String toString(){
        return "The " + this.name + " book contains " + this.pagesNumber + " pages";
    }
}