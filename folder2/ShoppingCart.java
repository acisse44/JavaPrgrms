import java.util.*;

public class ShoppingCart implements Iterable<Item>{ //ShoppingCart class which implements the iterable interface
    private LinkedList <Item> list;
    public ShoppingCart(){
        list = new LinkedList<>();
    }
    public void addItem(Item item) {//Adds the item to our list
        list.add(item);
    }
    public double grandTotal() { //For every item in our list, add to the sum to retrieve the total.
        double sum = 0;
        for (Item i : list)
            sum += i.getPrice();
        return sum;
    }
    public int numItems(){
        return list.size();
    }
    public String toString() {
        return list.toString();

    }
    @Override
    public Iterator <Item> iterator() { //Written b/c we implement iterable, linked list has a built-in iterator which we can use
        return list.iterator();
    }
}
