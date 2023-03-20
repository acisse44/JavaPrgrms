public class Item { //Item class which identifies an item with a name and price

    private String name;
    private double price;

    public Item(String name, double price) { //Constructor for name and price
        this.name = name;
        this.price = price;

    }
    public String getName(){
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

    public String toString() {
        //toString representation of the item name and cost
        return "Item name " + this.name + " and cost $" + this.price;
    }
}
