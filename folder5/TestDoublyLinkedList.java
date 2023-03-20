import java.util.*;
public class Main {
    public static void main(String[] args) {

        MyDLinkedList<String> myList = new MyDLinkedList<>();

        System.out.println("My List:");
        myList.addFirst("Brooklyn");
        myList.addFirst("Bronx");
        myList.addFirst("Staten Island");

        myList.addLast("Queens");
        myList.addLast("Manhattan");
        myList.addLast("Boroughs in NYC");

        for(String a: myList) {
            System.out.println(a);
        }
        System.out.println("My list of size " + myList.size());
        System.out.println();

        System.out.println("Test Remove");
        System.out.println(myList.removeFirst() + "-<- head being removed" );
        System.out.println(myList.removeLast() + "-<- tail being removed" );

        System.out.println();
        System.out.println("New List:");
        for(String b: myList) {
            System.out.println(b);
        }

        System.out.println();
        System.out.println("Test Getters ");
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        System.out.println(myList.get(2));

        System.out.println();
        System.out.println("Test Contains & IndexOf ");
        System.out.println(myList.contains("Bronx"));
        System.out.println(myList.indexOf("Queens"));

        System.out.println("Test Setter ");
        System.out.println(myList.set(3, "New York City") + " <- being replaced");
        System.out.println();
        System.out.println("New List:");
        for(String c: myList) {
            System.out.println(c);
        }
        System.out.println("My list of size " + myList.size());

    }
}
