package PR3;
import PR3.entities.Author;

public class testAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Rita", "ritam@gmail.com", 'F');
        Author a2 = new Author("Andrey", "kandrey@gmail.com", 'M');
        Author a3 = new Author("Selim", "bazarovs@gmail.com", 'U');

        System.out.println(a2.getEmail());
        System.out.println(a3.getName());
        System.out.println(a1.getGender() + "\n");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
