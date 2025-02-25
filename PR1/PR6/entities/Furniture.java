package PR6.entities;

public abstract class Furniture {
    protected String model;
    protected String material;
    protected double price;

    public Furniture(String model, String material, double price) {
        this.model = model;
        this.material = material;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public String toString() {
        return "Furniture: {model: " + model + ", material: " + material + "}";
    }
}