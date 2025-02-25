package PR4;
import PR4.entities.Circle;

public class testCircle {
    public static void main(String[] args){
        Circle c1 = new Circle(0, 0);

        System.out.println(c1.getRadius());
        System.out.println(c1.getDiameter());

        c1.setRadius(4);
        c1.setDiameter(8);
        System.out.println(c1);
    }
}
