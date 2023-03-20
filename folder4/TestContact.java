public class TestContact {
    public static void main(String[] args) {
        testConstructorAndGetters();
        testCompareTo();
        testToString();
        testEquals();
        testUpdateContact();
    }

    private static void testConstructorAndGetters() {
        System.out.println();
        System.out.println("testing constructor and getters");

        Contact person = new Contact("Aminata", "Cisse", "(347) 555-5555"); //Creating a new Contact object
        System.out.println(person); //Will call the toString() method of person's type; Contact
        System.out.println(person.getFirstName()); //prints first name of person

        System.out.println();

        Contact person2 = new Contact("Dr.", "Suess", "(347) 512-4444", "1330 Webster Avenue", "Bronx", "NY");
        System.out.println(person2);    //does the toString() method of person2's type; Contact
        System.out.println(person2.getLastName());   //prints last name of person 2

    }

    private static void testCompareTo() {
        System.out.println();
        System.out.println("testing compareTo");

        Contact person3 = new Contact("Brooklyn", "College", "(917) 533-5222");
        Contact person4 = new Contact("Brooklyn", "College", "(347) 211-2332");
        System.out.println(person3.compareTo(person4)); //0 is expected since first & last are the same

        Contact person5 = new Contact("Brooklyn", "Samuels", "(347) 545-2432");
        System.out.println(person3.compareTo(person5)); // some negative number expected

        Contact person6 = new Contact("Ari", "Mermelstein", "(213) 900-6000");
        System.out.println(person5.compareTo(person6)); // some positive number expected

    }

    private static void testToString() {
        System.out.println();
        System.out.println("testing toString");


        Contact person7 = new Contact("Mary", "Cisse", "(212) 099-3776", "2900 Bedford Avenue", "Queens", "NY");
        System.out.println(person7); //toString() method of Contact

    }

    private static void testEquals() {
        System.out.println();
        System.out.println("testing equals");

        Contact person8 = new Contact("Fatim", "Musa", "(718) 989-3836", "1515 King Avenue", "Manhattan", "NY");
        Contact person9 = new Contact("Kim", "Roberts", "(212) 662-0038", "3432 Valentine Avenue", "Brooklyn", "NY");

        System.out.println(person8.equals(person9)); //false expected

        Contact person10 = new Contact("Fatim", "Musa", "(212) 006-5455", "1515 Queen Avenue", "bronx", "NY");
        System.out.println(person8.equals(person10)); //true expected

    }

    private static void testUpdateContact() {
        System.out.println();
        System.out.println("testing update contact");

        Contact person11 = new Contact("Dr.", "Suess", "(347) 512-4444", "1330 Webster Avenue", "Bronx", "NY");
        person11.updateContact("Mrs.", "Suess", "(347) 511-3333", "500 Jackson Avenue", "Queens", "NJ");

        System.out.println(person11); //Prints the updated contact of person 11
    }

}

