package PR4.entities;

public class Hand {
    private int fingers;

    public Hand(int fingers) {
        this.fingers = fingers;
    }
    public int getHandFingers(){
        return fingers;
    }
    public String toString() {
        return "Hand with " + fingers + " fingers";
    }
}
