package PR5;
import PR5.entities.MovableCircle;
import PR5.entities.MovablePoint;
import PR5.entities.MovableRectangle;

public class testMovable {
    public static void main(String[] args) {
        System.out.println("Current positions");
        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        MovableRectangle rectangle = new MovableRectangle(0, 10, 10, 0, 2, 2);
        System.out.println(circle);
        System.out.println(point);
        System.out.println(rectangle + "\n");

        System.out.println("New MovablePoint position");
        point.moveUp();
        System.out.println(point + "\n");

        System.out.println("New MovableCircle position");
        circle.moveRight();
        circle.moveUp();
        System.out.println(circle);
        System.out.println(circle + "\n");

        System.out.println("New MovableRectangle position");
        rectangle.moveRight();
        rectangle.moveDown();
        System.out.println(rectangle);
    }
}
