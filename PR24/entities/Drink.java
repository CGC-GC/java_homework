package PR24.entities;
import PR24.interfaces.Item;

public class Drink implements Item {
    private final double cost;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        this.cost = 0;
        this.name = name;
        this.description = description;
    }
    public Drink(double cost, String name, String description) {
        if (cost < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Invalid Drink parameters");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
    public double getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}