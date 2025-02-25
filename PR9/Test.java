package PR9;
import PR9.entities.*;

public class Test {

    public static void main(String[] args) {
        Book b1 = new Book("TLOTR", "J.R.R. Tolkin", 110);
        Car c1 = new Car("Porsche", "911", 150000);

        System.out.println(b1.getName() + " " + b1.getPrice());
        System.out.println(c1.getName() + " " + c1.getPrice());
    }
}
