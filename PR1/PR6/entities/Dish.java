package PR6.entities;

public abstract class Dish {
    protected String material;
    protected String color;

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }
    public abstract String getDetails();
    @Override
    public String toString() {
        return "Dish: {material: " + material + ", color: " + color + "}";
    }
}