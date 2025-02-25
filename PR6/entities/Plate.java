package PR6.entities;

public class Plate extends Dish {
    private double diameter;

    public Plate(String material, String color, double diameter) {
        super(material, color);
        this.diameter = diameter;
    }
    @Override
    public String getDetails() {
        return "Diameter: " + diameter + " cm";
    }
}