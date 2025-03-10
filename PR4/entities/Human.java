package PR4.entities;

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }
    public Head getHead() {
        return head;
    }
    public Leg getLeftLeg() {
        return leftLeg;
    }
    public Leg getRightLeg() {
        return rightLeg;
    }
    public Hand getLeftHand() {
        return leftHand;
    }
    public Hand getRightHand() {
        return rightHand;
    }
}
