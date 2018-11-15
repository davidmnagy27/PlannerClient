/* David Nagy
 * Planner Assignment 2
 * 4/25/18
 * Description: abstract class that prints the personal/business contact 
 */

package planner;
//class Contact defined as abstract, as  must be either Personal or Business
public class Contact {
	
	// private fields of Contact class
	private String firstName;
	private String lastName;
	private String email;
	private boolean gender;
	public Contact(String firstName, String lastName, String email, boolean gender) {
		// this is setting up the constructor, assigning all the fields of the Contact class
		
		//Start contact class
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		
		
	}// this method is getter for name of the contact
	public String getName() {
		return firstName+" "+lastName;
	}// this method is getter for getEmail 
	public String getEmail() {
		return email;
	}// this method is getter for getGender 
	public boolean getGender() {
		return gender;
	}
	
	public void printContact() {
		System.out.println(this.toString());
	}
	
	
	//this method returns appropriate string representation of Contact instance	
	public String toString() {
		return getName()+"("+getEmail()+")";
	}
	
	
	
}//end Contact class
