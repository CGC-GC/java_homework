package PR6;
import PR6.entities.*;

public class Test {
    public static void main(String[] args) {
        Dish plate = new Plate("Ceramic", "White", 25.0);
        Dish cup = new Cup("Glass", "Transparent", 250.0);
        System.out.println("\n" + plate);
        System.out.println(plate.getDetails());
        System.out.println(cup);
        System.out.println(cup.getDetails());

        Dog bulldog = new Bulldog(5);
        Dog beagle = new Beagle(3);
        System.out.println("\n" + bulldog);
        System.out.println(bulldog.getColor());
        System.out.println(beagle);
        System.out.println(beagle.getColor());

        FurnitureShop shop = new FurnitureShop();
        shop.displayFurniture();
    }
}