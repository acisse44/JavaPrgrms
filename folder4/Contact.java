//A class that implements a contact book entry. 
//Implements the comparable interface 
public class Contact implements Comparable <Contact> {


   //Your Contact class should have the following private data:
   private String firstName;
   private String lastName;
   private String phoneNum;
   private String address;
   private String cityName;
   private String stateName;
 
 
   //Your class should have the following public methods:
   //A constructor that initializes all the fields with information.
   public Contact(String firstName, String lastName, String phoneNum, String address, String cityName, String stateName) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNum = phoneNum;
      this.address = address;
      this.cityName = cityName;
      this.stateName = stateName;
   }
   
   //A constructor that initializes only the name and phone number.
   public Contact(String firstName, String lastName, String phoneNum) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNum = phoneNum;
   
   }
  
   // Accessor (getter) methods for all of the data members.
   public String getFirstName() { 
      return this.firstName;
   }
   public String getLastName() { 
      return this.lastName;
   }
   public String getPhoneNum() { 
      return this.phoneNum;
   }
  
   public String getAddress() { 
      return this.address;
   }
   public String getCityName() { 
      return this.cityName;
   }
   public String getStateName() { 
      return this.stateName;
   }

   // Update method that allows the user to change all information.
   public void updateContact(String firstName, String lastName, String phoneNum, String address, String cityName, String stateName) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNum = phoneNum;
      this.address = address;
      this.cityName = cityName;
      this.stateName = stateName;
   }

   /* An overridden equals() method:
   One Contact as being the same as another contact if the first and last names both match. 
   */  
   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Contact) {
         Contact other = (Contact) obj;
         return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
      } else {
         return false;
      }
   }

   /*An overridden toString() method:
   The String should be created in the following form:
   <First name> <last name> Phone number: <phone number>
   <street address>
   <city> , <state>
   */
   @Override
   public String toString(){
      String fullName = this.firstName + " " + this.lastName;
      String fullAddress = this.cityName + "," + this.stateName;
      
      return fullName + " " + "Phone number: " + this.phoneNum + "\n" +
                this.address + "\n" + fullAddress;
   }
 
   /*A comparison method:
   If the last name of “another” is lexicographically first, return a positive
   number.
   If the last name of “another” is lexicographically second, return a negative
    number.
   If the last names are the same and the first names are also the same, return 0.
   If the last names are the same and the first names are different, use the first
   names to determine the order.
   */
   public int compareTo(Contact another) {
      if(this.lastName.equals(another.lastName) && (!this.firstName.equals(another.firstName))){
         return this.firstName.compareTo(another.firstName);
      }
      return this.lastName.compareTo(another.lastName);
   }     
}   
