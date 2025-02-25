package PR4;
import PR4.entities.Book;

public class testBook {
    public static void main(String[] args){
        Book b1 = new Book("D. Gras", "Data science", "Short course about data science", 2018);
        Book b2 = new Book("S. King", "The Call of Cthulhu", "A book about ancient evil");
        Book b3 = new Book("J. Rowling", "Harry Potter");
        Book b4 = new Book("L. Tolstoy");
        Book b5 = new Book();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        b3.setBookDescription("A book about one boy who survived");
        b5.setBookName("War and Peace");
        b4.setBookYearOfWriting(1689);
        b4.setBookAuthor("L.Tolstoy");

        System.out.println("Updated data \n");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
