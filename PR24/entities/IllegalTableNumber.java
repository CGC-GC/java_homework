package PR24.entities;

public class IllegalTableNumber extends IllegalArgumentException {
    public IllegalTableNumber(String message) {
        super(message);
    }
}