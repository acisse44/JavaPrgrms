//Implementing a Contact List class that implements the iterable interface.
import java.util.*;
public class ContactList implements Iterable <Contact> {

    private ArrayList<Contact> list; //underlying structure
    public ContactList() { //Empty contact list
        list = new ArrayList<>();
    }

    public ContactList(Contact [] contacts){ //Initializing contact list using Arrays.asList
        list = new ArrayList <>(Arrays.asList(contacts));
        Collections.sort(list);
    }

    public Contact findByLastName(String last) { //Binary search of list to find reference to contact w/ last name
        int start = 0;
        int end = list.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (last.equals(list.get(mid).getLastName()))
                return list.get(mid); //returns the Contact object where we found the last name
            if (last.compareTo(String.valueOf(list.get(mid))) < 0)
                start = mid + 1; //updating values
            else
                end = mid - 1;
        }

        return null;
    }

    public Contact findByPhoneNumber(String phone) { //For each loop of list to find reference to contact by phone
        for (Contact v : list) {
            if (v.getPhoneNum().equals(phone))
                return v;
        }
        return null;
    }

    public ContactList findAllByLastInitial(char ch) { //For each loop of list to find all contacts w/ a last initial
        ContactList contacts = new ContactList();
        for(Contact w: list) {
            if(w.getLastName().charAt(0)==(ch))
                contacts.add(w);
        }
        return contacts;
    }

    public ContactList findAllByCity(String city) { //For each loop of list to find all contacts w/ a city
        ContactList contacts = new ContactList();
        for(Contact x: list) {
            if(x.getCityName().equals(city)) {
                contacts.add(x);
            }
        }
        return contacts;
    }

    public boolean add(Contact c) { //Collections Binary Search to sort and place in ordered position

        int index = Collections.binarySearch(list, c);
        if(index < 0) {
            list.add(-index -1,c);
            return true;
        }
        return false;
    }

    public int size() { //size of list
        return list.size();
    }

    // A method that allows you to remove and return a Contact from the ContactList.
    public Contact remove(Object obj) {
        list.remove(obj);

        return (Contact) obj;
    }

    public Contact get(int index){ //returning contact by given index
        if(index <0 || index >= list.size())
            throw new IndexOutOfBoundsException();

        return list.get(index);
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof ContactList) {
            ContactList other = (ContactList) obj;
            return this.list.equals(other.list); //ArrayLists has an equals method which we can simply use to compare each list
        }
        return false;

    }

    @Override
    public String toString() {
        return list.toString();
    }

    public Iterator<Contact> iterator() { //Using an iterator to travel through the array list
        Iterator<Contact> myIterator = list.iterator();
        return myIterator;
    }

}
