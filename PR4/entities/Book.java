package PR4.entities;

public class Book {
    private String name;
    private int pagesNumber;
    private String bookAuthor;
    private String bookName;
    private String bookDescription;
    private int bookYearOfWriting;

    public Book(String bookAuthor, String bookName, String bookDescription, int bookYearOfWriting){
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.bookYearOfWriting = bookYearOfWriting;
        }
    public Book(String bookAuthor, String bookName, String bookDescription){
                this.bookAuthor = bookAuthor;
                this.bookName = bookName;
                this.bookDescription = bookDescription;
                this.bookYearOfWriting = 0;
    }
    public Book(String bookAuthor, String bookName){
                this.bookAuthor = bookAuthor;
                this.bookName = bookName;
                this.bookDescription = "Have no description";
                this.bookYearOfWriting = 0;
    }
    public Book(String bookAuthor){
                this.bookAuthor = bookAuthor;
                this.bookName = "No book name";
                this.bookDescription = "Have no description";
                this.bookYearOfWriting = 0;
    }
    public Book(){
                name = "Harry Potter (standard)";
                pagesNumber = 999;
                this.bookAuthor = "No book author";
                this.bookName = "No book name";
                this.bookDescription = "No book description";
                this.bookYearOfWriting = 0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBookAuthor(){
        return this.bookAuthor;
    }
    public String getName(){
        return name;
    }
    public String getBookName(){
        return this.bookName;
    }
    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }
    public String getBookDescription () {
            return this.bookDescription;
    }
    public int getPagesNumber() {
        return pagesNumber;
    }
    public int getBookYearOfWriting(){
        return this.bookYearOfWriting;
    }
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setBookDescription(String bookDescription){
        this.bookDescription = bookDescription;
    }
    public void setBookYearOfWriting(int bookYearOfWriting){
        this.bookYearOfWriting = bookYearOfWriting;
    }
    public String toString(){
        return "Book: " + this.bookName + "\nAuthor of book: " + this.bookAuthor + "\nDescription: " + this.bookDescription + "\nBook was written in " + this.bookYearOfWriting + "\n";
    }
}
