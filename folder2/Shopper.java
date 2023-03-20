public class Shopper implements Comparable <Shopper> { //Shopper class which represents a shopper w/ their full name and shopping cart

    private String firstName;
    private String lastName;
    private ShoppingCart myCart;

    public Shopper(String firstName, String lastName) { //Initializes the first & last name and creates a new shopping cart
        this.firstName = firstName;
        this.lastName = lastName;
        this.myCart = new ShoppingCart();

    }

    public void addItemToCart(Item item, int numItems) {
        //Traversing w/ loop to check if items are the same type, add numItems of the items to the cart
        for (int i = 0; i < numItems; i++)
                myCart.addItem(item);
    }

    public double amountOwed() {
        //Can simply call the grandTotal method of the ShoppingCart class and calculate the tax
        return (myCart.grandTotal() + (myCart.grandTotal() * 0.08875));
    }

    @Override
    public int compareTo(Shopper other) {//Comparing shoppers as we prioritize the shopper who spends the most.
        //If this has a bigger total than other -num returned, else a +num returned. If they're the same 0 is returned.
        return (int) (other.amountOwed() - this.amountOwed());
    }
}
