package PR6.entities;

public class FurnitureShop {
    public void displayFurniture() {
        Furniture chair = new Chair("Golden hour","Wood", 150.0);
        Furniture table = new Table("Golden't hour","Metal", 300.0);

        System.out.println("\n" + chair);
        System.out.println("Price: " + chair.getPrice());
        System.out.println(table);
        System.out.println("Price: " + table.getPrice());
    }
}