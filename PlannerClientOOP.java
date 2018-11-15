/* David Nagy
 * Planner Assignment
 * 4/25/18
 * Description Planner driver
 */

package planner;
import java.time.LocalDate;
import java.util.Scanner;

public class PlannerClientOOP {

	private static final String CONTACT = "1", STATS = "2", EXIT = "3";
	private static final int MAX_CONTACTS = 6;
	private Contact[] contacts;
	private int personalContacts;
	private int females;
   
	public PlannerClientOOP() {
		createContacts();
	}

	public int getNumBusiness() {
		return contacts.length - personalContacts;
	}
	public int getNumPersonal() {
		return personalContacts;
	}
	
	public int getFemales() {
		return females;
	}
	
	public int getMales() {
		return contacts.length-females;
	}
	
	public void gatherStats() {
		for (Contact c : contacts) {
			if (c.getGender())
				females++;

			if (c instanceof PersonalContact)
				personalContacts++;

		}
	}

	public Contact[] getContacts() {
		return contacts;
	}

	public static void main(String[] args) {
		PlannerClientOOP planner = new PlannerClientOOP();

		Scanner in = new Scanner(System.in);
		String choice = "";

		while (!choice.equals(EXIT)) {

			planner.displayMenu();
			System.out.print("Enter your numerical choice:");
			choice = in.next();

			if (choice.equals(CONTACT)) {
				System.out.println();
				for (Contact c : planner.getContacts()) {
					c.printContact();
				}
				System.out.println();
			} else if (choice.equals(STATS)) {
				planner.gatherStats();
				planner.printStats();
			} else if (choice.equals(EXIT)) {
				break;
			} else {
				System.out.println("Invalid choice, try again");
			}
		}
		System.out.println("Goodbye");
		in.close();

	}

	public void displayMenu() {
		System.out.println();
		System.out.println("Welcome to my planner!");
		System.out.println("1.  Print planner contacts.");
		System.out.println("2.  Print statistics.");
		System.out.println("3.  Exit.");
		System.out.println();
	}

	public void printStats() {
		System.out.println();
		System.out.println("Number of contacts: " + contacts.length);
		System.out.println("Number of personal contacts: " + getNumPersonal());
		System.out.println("Number of business contacts: " + getNumBusiness());
		System.out.println("Male contacts: " + getMales());
		System.out.println("Female contacts: " + getFemales());
		System.out.println();
	}

	public void createContacts() {
		contacts = new Contact[MAX_CONTACTS];
        // LocalData.of(YYYY,MONTH,DAY);
		contacts[0] = new PersonalContact("Joe", "Smith", "jsmith@gmail.com", false, LocalDate.of(2010, 3, 16),
				"100 Evergreen Ave, Seattle, WA, 98999");
		contacts[4] = new PersonalContact("Lawrence", "Williams", "lolawrence@yahoo.com", false,
				LocalDate.of(2000, 10, 1), "1501 1st St, Tacoma, WA, 98100");
		contacts[5] = new PersonalContact("Rachel", "Garcia", "gargar@comcast.net", true, LocalDate.of(1996, 2, 20),
				"12 Forest Drive, Los Angelos, CA, 99301");

		contacts[1] = new BusinessContact("Gregory", "Smith", "gregsmith@livemail.com", false, "Amazon.com",
				"Sales representative", "222-333-4444");
		contacts[2] = new BusinessContact("Susie", "Adams", "sadams@gmail.com", true, "Group Health",
				"Database Administrator", "333-444-5555");
		contacts[3] = new BusinessContact("Jerome", "Bradley", "bradleyj@yahoo.com", false, "Costco",
				"Software Developer", "555-666-7777");

	}

}
