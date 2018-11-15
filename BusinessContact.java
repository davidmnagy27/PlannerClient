/* David Nagy
 * Planner Assignment
 * 4/25/18
 * Description  abstract class that prints the Business contact
 */

package planner;
//This class extends abstract class Contact so that this class could find the constructor and toString method of class Contact
//Also  implements abstract method printcontact
public class BusinessContact extends Contact {
	//start BusinessContact class 
	private String company;
	private String position;
	private String phoneNumber;
	
	// this is setting up the constructor, assigning all the fields of the BusinessContact class (including Contact class fields)
		// access to Contact class fields is provided via "super"
	public BusinessContact(String firstName, String lastName, String email, boolean gender, String company,
			String position, String phoneNumber) {
		super(firstName, lastName, email, gender);
		this.company = company;
		this.position = position;
		this.phoneNumber = phoneNumber;
	}// this method is getter for company private field
	public String getCompany() {
		return company;
	}//this method is the getter for getPosition
	public String getPosition() {
		return position;
	}
	
	// this method is getter for phoneNumber private field
	public String getPhoneNumber() {
		return phoneNumber;
	}
	//this method is getter for printContact private field
	public void printContact() {
		
	}
	// this method returns appropriate string representation of BusinessContact instance, containing the string for parent Contact class
		// access to Contact class toString is provided via "super"
	public String toString() {
		return "BusinessContact "+super.toString()+", "+getCompany()+", "+getPosition()+", "+getPhoneNumber();
	}
	
	

}//end Businesscontact
