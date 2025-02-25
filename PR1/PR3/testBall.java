package PR3;
import  PR3.entities.Ball;

public class testBall {
    public static void main(String[] args){
        Ball b1 = new Ball(55.7, 33.8);
        Ball b2 = new Ball();
        System.out.println("Current coordinates");
        System.out.println(b1);
        System.out.println(b2 + "\n");

        b1.move(35, 81.5);
        b2.move(78.1, 89.32);

        System.out.println("Updated coordinates");
        System.out.println(b1);
        System.out.println(b2);
    }
}
