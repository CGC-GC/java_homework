package PR6.entities;

public class Cup extends Dish {
    private double volume;

    public Cup(String material, String color, double volume) {
        super(material, color);
        this.volume = volume;
    }
    @Override
    public String getDetails() {
        return "Volume: " + volume + " ml";
    }
}