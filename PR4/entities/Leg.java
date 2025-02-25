package PR4.entities;

public class Leg {
    private int length;

    public Leg(int length) {
        this.length = length;
    }
    public int getLegLength(){
        return length;
    }
    public String toString() {
        return "Legs length is " + length;
    }
}