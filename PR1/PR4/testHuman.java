package PR4;
import PR4.entities.Leg;
import PR4.entities.Hand;
import PR4.entities.Human;
import PR4.entities.Head;

public class testHuman {
    public static void main(String[] args) {
        Head head = new Head("Brown", "Blue");

        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(81);

        Hand leftHand = new Hand(4);
        Hand rightHand = new Hand(5);
        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        System.out.println(person.getHead() + "\n");
        System.out.println(person.getLeftHand());
        System.out.println(person.getRightHand() + "\n");
        System.out.println(person.getLeftLeg());
        System.out.println(person.getRightLeg());
    }
}
