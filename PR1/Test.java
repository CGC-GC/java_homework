package PR1;
import PR1.entities.Dog;
import PR1.entities.Ball;
import PR1.entities.Book;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob"); d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        Ball a1 = new Ball("big", "blue");
        Ball a2 = new Ball("medium"); a2.setColor("purple");
        Ball a3 = new Ball("", "yellow"); a3.setSize("small");
        Ball a4 = new Ball();
        System.out.println("\n" + a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        Book c1 = new Book("Toy story", 1254);
        Book c2 = new Book("War and Peace"); c2.setPagesNumber(10478);
        Book c3 = new Book("", 897); c3.setName("Goete philosophy");
        Book c4 = new Book();
        System.out.println("\n" + c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
