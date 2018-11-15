/* David Nagy
 * Planner Assignment 2
 * 4/25/18
 * Description abstract class that prints the personal contact
 */

package planner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//this class extends the contact class, Contact so that this class could find the constructor and toString method of class Contact

public class PersonalContact extends Contact {
	
	// Start personalContact  
	private LocalDate birthDate;
	private String address;

	//this is setting up the constructor, assigning all the fields of the PersonalContact class (including Contact class fields)

	public PersonalContact(String firstName, String lastName, String email, boolean gender, LocalDate birthDate,
			String address) {
		super(firstName, lastName, email, gender);
		this.birthDate = birthDate;
		this.address = address;
	}// declaring getters and setters

	//this method is getter for birthDate
	public LocalDate getBirthDate() {
		return birthDate;
	}
	//this method is getter for getAddress 
	public String getAddress() {
		return address;
	}
	//this method is getter for printContact
	public void printContact() {
		System.out.println(this.toString());
	}

	//start toString
	// Birth date is output with DateTimeFormatter.
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return "PersonalContact : " + super.toString() + ", " + birthDate.format(dtf) + ", " + getAddress();
	}//end tostring
	

}//end personal class
