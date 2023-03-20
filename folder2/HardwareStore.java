import java.util.*;

public class HardwareStore { //HardwareStore class w/ a list of items and the Store total
    private PriorityQueue<Shopper> pq = new PriorityQueue<>();
    private ArrayList<Item> myList = new ArrayList<>(); //ArrayList to hold our items
    private double storeTotal;

    public HardwareStore() { //should be default constructor no parameters
        myList = new ArrayList<>();
    }

    public void addShopperToLine(Shopper shopper) {//Adding the shopper to our PriorityQueue
        pq.add(shopper);
    }

    public void checkoutAllShoppers() {
        //For every shopper in our priority queue, add their owed amount into the store's expected total.
        for(Shopper shopper: pq) {
            storeTotal += shopper.amountOwed();
        }
        pq.clear(); //Then remove all shoppers from the priority queue (Indicating they were processed)
    }
    public double totalRevenue() {
        return storeTotal; //Already keeping track of money taken in thus far.
    }

    public void addItem(Item item) {//Adds the item to our list
        myList.add(item);
    }
    public Item getItem(String s) { //Additional getItem method which takes in a String and searches our list for a match
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getName().equals(s))
                return myList.get(i);
        }
            return null;
        }
    }

