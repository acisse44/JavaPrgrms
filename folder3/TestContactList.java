public class TestContactList {
   public static void main(String[] args) {

        Contact person = new Contact("Aminata", "Cisse", "(347) 555-5555", "2900 Bedford Avenue", "Queens", "NY");
        Contact person2 = new Contact("Brooklyn", "College", "(917) 533-5222", "1515 King Avenue", "Manhattan", "NY");
        Contact person3 = new Contact("Dr.", "Suess", "(347) 512-4444", "1330 Webster Avenue", "Bronx", "NY");
        Contact person4 = new Contact("Mrs.", "Suess", "(347) 511-3333", "500 Jackson Avenue", "Queens", "NJ");

        Contact[] contacts = {person, person2, person3, person4};
        ContactList contactList = new ContactList(contacts);

        System.out.println("testing constructors:");
        System.out.println(contactList);

        System.out.println("testing empty constructor:");
        ContactList EmptyContact = new ContactList();
        System.out.println(EmptyContact);
        System.out.println();

        System.out.println("Testing Find by Last name:");
        System.out.println(contactList.findByLastName("Cisse"));
        System.out.println();

        System.out.println("Testing Find by Phone number:");
        System.out.println(contactList.findByPhoneNumber("(347) 511-3333"));
        System.out.println();

        System.out.println("Testing Find all by Last name initial:");
        System.out.println(contactList.findAllByLastInitial('S'));
        System.out.println();

        System.out.println("Testing Find all by City name:");
        System.out.println(contactList.findAllByCity("Queens"));
        System.out.println();

        System.out.println("Testing Add:");
        Contact person5 = new Contact("Steve", "Jobs", "(931) 600-5445", "2177 Hollywood Avenue", "Inglewood", "CA");
        System.out.println(contactList.add(person5));
        System.out.println();

        System.out.println("Reprinting current contacts:");
        System.out.println(contactList);
        System.out.println();

        System.out.println("Testing size");
        System.out.print("Our size: ");
        System.out.println(contactList.size());
        System.out.println();

        System.out.println("Testing remove:");
        System.out.println(contactList.remove(person2));
        System.out.println("Reprinting current contacts:");
        System.out.println(contactList);
        System.out.println("Updated size:" + contactList.size());
        System.out.println();


        System.out.println("Testing get:");
        System.out.println(contactList.get(3));
        System.out.println();

        System.out.println("Testing equals:");
        System.out.println(person3.equals(person2)); //should return false
        System.out.println();

        System.out.println("Testing toString:");
        System.out.println(person5);
        System.out.println();

    }
}