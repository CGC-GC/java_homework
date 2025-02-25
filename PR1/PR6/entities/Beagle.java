package PR6.entities;

public class Beagle extends Dog {
    public Beagle(int age) {
        super("Beagle", age);
    }
    @Override
    public String getColor() {
        return "Color: Tricolor (White, Brown, Black)";
    }
}