public class Shirt {
    public int shirtID = 6;
    public String description = "Cool shirt";
    public String colorCode = "Red";
    public double price = 200.0;
    public int quantityInStock = 5;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
