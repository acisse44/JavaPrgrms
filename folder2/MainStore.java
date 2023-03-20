import java.io.File;
import java.util.*;

public class MainStore {
    public static void main (String [] args) throws Exception {
        //Inventory File which will hold a list of items sold at store and their costs
        Scanner sc = new Scanner(new File("Inventory.txt"));

        HardwareStore hs = new HardwareStore();

        while(sc.hasNext()) { //Reading our lines written in the order of name then cost
            String name = sc.next();
            double cost = sc.nextDouble();
            Item item = new Item(name, cost); //Creating an item object with our name and cost.
            hs.addItem(item);
        }
        sc.close();

        //Event File which will holds a list of customer info based on their name, total items, and items purchased
        Scanner newSc = new Scanner(new File("Event.txt"));

        while(newSc.hasNext()) {
            //Reading in a shopper and creating a shopper object to add to the store.
            String firstName = newSc.next();
            String lastName = newSc.next();

            Shopper shopper = new Shopper(firstName, lastName);
            int n = newSc.nextInt();
            for(int i = 0; i < n; i++) { //Reads the line w/ shopper info
                String s = newSc.next();
                Item myItem = hs.getItem(s);
                int numPieces = newSc.nextInt();
                shopper.addItemToCart(myItem, numPieces); //Adds numPieces of items to the cart
            }
            hs.addShopperToLine(shopper); //Adding the shopper to the line during the process
        }

        hs.checkoutAllShoppers(); //Checkout the shopper after processing.

        double totalRevenue = hs.totalRevenue(); //Total store revenue based on our event file of customers and their purchases
        System.out.printf("Store grand total in the end: $%.2f \n", totalRevenue);

        }
    }
