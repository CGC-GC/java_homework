package PR6.entities;

public class Bulldog extends Dog {
    public Bulldog(int age) {
        super("Bulldog", age);
    }
    @Override
    public String getColor() {
        return "Color: Brown";
    }
}