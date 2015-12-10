import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author David Herr This class jumps to the validation class and tells tells
 *         the user what they typed, but this time it also loads files,
 *         validates them, and reads the file back to the user
 */
public class ContactWriterReader {

	/**
	 * @author David Herr This class jumps to the validation class and tells
	 *         tells the user what they typed
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		Contact testContact = new Contact();
		String input = null; // variable for users input
		Scanner keyboard = new Scanner(System.in); // creates Scanner Object
		File myFile = new File( "myOutputFile.txt" );
		String inputString = "Contact";
		int inputInt;
		BufferedReader inputFile;
		int c = 1;
		Contact [] StoreArray = new Contact [25];
	
		
				
		System.out.println( "Welcome to the new and improved contact class!!! " );
		
		while( !myFile.exists() ){
			myFile = new File( inputString );
			StoreArray = new ContactWriterReader [inputInt];
			
			System.out.print("Enter the last name: ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setLastName(input); // sends input to setLastName method to be validated
			
			StoreArray = Contact.getLastName();
					
			System.out.println("Last name: " + testContact.getLastName()); // displays users input

			System.out.print("Enter the first name: ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setFirstName(input); // sends input to setFirstName method to be validated

			System.out.println("First name: " + testContact.getFirstName()); // displays users input

			System.out.print("Enter the Middle name: ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setMiddleName(input); // sends input to setMiddleName method
												// to be validated

			System.out.println("Middle name: " + testContact.getMiddleName()); // displays users input

			System.out.print("Enter the prefix (if you have none, input none): ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setPrefix(input); // sends input to setPrefix method to be validated

			System.out.println("Prefix: " + testContact.getPrefix()); // displays users input

			System.out.print("Enter the phone number: ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setPhoneNum(input); // sends input to setPhoneNum method to be validated

			System.out.println("Phone number: " + testContact.getPhoneNum()); // displays users input

			System.out.print("Enter the Email: ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setEmail(input); // sends input to setEmail method to be validated

			System.out.println("Email: " + testContact.getEmail()); // displays users input

			System.out.print("Enter the Street: ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setStreet(input); // sends input to setStreet method to be validated

			System.out.println("Street: " + testContact.getEmail()); // displays users input

			System.out.print("Enter the City: ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setCity(input); // sends input to setCity method to be validated

			System.out.println("City: " + testContact.getCity()); // displays users input

			System.out.print("Enter the State: ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setState(input); // sends input to setState method to be validated

			System.out.println("State: " + testContact.getState()); // displays users input

			System.out.print("Enter the Zip Code: ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setZipCode(input); // sends input to setZipCode method to be
											// validated

			System.out.println("Zip code: " + testContact.getZipCode()); // displays users input

			System.out.print("Enter the Occupation: ");
			input = keyboard.nextLine(); // changes value of input
			testContact.setOcupation(input); // sends input to setOccupation method to be validated

			System.out.println("Occupation: " + testContact.getOccupation()); // displays users input
			
			System.exit(0);

		}
		
		inputFile[i] = new contact();
		inputFile = new BufferedReader( new FileReader( myFile ));
		
		
		inputFile.mark(256);
	
		while(  inputFile.ready() ){
			inputString = inputFile.readLine();
			System.out.println( "line [" + c++ +"] = " + inputString );
		}
		
		inputFile.reset();
		
		Stream<String> newStream;
		newStream = inputFile.lines();
		
		newStream.forEach( s -> System.out.println(s) );
		
		inputFile.close();
		
		
		
	}

	public static class Contact {
		
		private String lName, fName, mName; // variables for last, first, and middle name
		String prefix; // variable for prefix
		String phoneNum; // variable for phone number
		String email; // variable for email
		String street, city, state, zip; // variables for street, city, state, and zip code
		String occupation; // variable for occupation
		
		Contact() {
		}

		/**
		 * Validates Last Name
		 * 
		 * @param n
		 */
		public void setLastName(String n) {
			// fix line 35 so it accepts special characters found in last names
			// ex. ' - spaces
			if (!n.matches("^[A-Za-z' -]+$")) { // this line is called a regular expression a.k.a. reg expression + means accept any
												// number of letters / characters
				System.out.println("Invalid characters in last name");
			} else {
				lName = n;
			}
		}

		/**
		 * returns last name to main
		 * 
		 * @return
		 */
		public String getLastName() {
			return lName;
		}

		/**
		 * Validates first name
		 * 
		 * @param n
		 */
		public void setFirstName(String n) {
			if (!n.matches("^[A-Za-z' -]+$")) {
				System.out.println("Invalid characters in first name");
			} else {
				fName = n;
			}
		}

		/**
		 * returns first name to main
		 * 
		 * @return
		 */
		public String getFirstName() {
			return fName;
		}

		/**
		 * Validates middle name
		 * 
		 * @param n
		 */
		public void setMiddleName(String n) {
			if (!n.matches("^[A-Za-z' -]+$")) {
				System.out.println("Invalid characters in middle name");
			} else {
				mName = n;
			}
		}

		/**
		 * returns middle name to main
		 * 
		 * @return
		 */
		public String getMiddleName() {
			return mName;
		}

		/**
		 * validates prefix
		 * 
		 * @param n
		 */
		public void setPrefix(String n) {
			if (!n.matches("^[A-Za-z. ]+$")) {
				System.out.println("Invalid characters in prefix");
			} else {
				prefix = n;
			}
		}

		/**
		 * returns prefix to main
		 * 
		 * @return
		 */
		public String getPrefix() {
			return prefix;
		}

		/**
		 * validates phone number
		 * 
		 * @param n
		 */
		public void setPhoneNum(String n) {
			if (!n.matches("^[0-9+ -]+$")) {
				System.out.println("Invalid characters in phone number");
			} else {
				phoneNum = n;
			}
		}

		/**
		 * returns phone number to main
		 * 
		 * @return
		 */
		public String getPhoneNum() {
			return phoneNum;
		}

		/**
		 * validates email
		 * 
		 * @param n
		 */
		public void setEmail(String n) {
			if (!n.matches("^[A-Za-z ,.'@?!-]+$")) {
				System.out.println("Invalid characters in email");
			} else {
				email = n;
			}
		}

		/**
		 * returns email to main
		 * 
		 * @return
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * Validates Street
		 * 
		 * @param n
		 */
		public void setStreet(String n) {
			if (!n.matches("^[A-Za-z ,.'-]+$")) {
				System.out.println("Invalid characters in street");
			} else {
				street = n;
			}
		}

		/**
		 * returns street to main
		 * 
		 * @return
		 */
		public String getStreet() {
			return street;
		}

		/**
		 * Validates city
		 * 
		 * @param n
		 */
		public void setCity(String n) {
			if (!n.matches("^[A-Za-z ,.'-]+$")) {
				System.out.println("Invalid characters in city");
			} else {
				city = n;
			}
		}

		/**
		 * returns city to main
		 * 
		 * @return
		 */
		public String getCity() {
			return city;
		}

		/**
		 * validates state
		 * 
		 * @param n
		 */
		public void setState(String n) {
			if (!n.matches("^[A-Za-z .]+$")) {
				System.out.println("Invalid characters in state");
			} else {
				state = n;
			}
		}

		/**
		 * returns state to main
		 * 
		 * @return
		 */
		public String getState() {
			return state;
		}

		/**
		 * Validates zip code
		 * 
		 * @param n
		 */
		public void setZipCode(String n) {
			if (!n.matches("^[0-9A-Z+ -]+$")) {
				System.out.println("Invalid characters in zip code");
			} else {
				zip = n;
			}
		}

		/**
		 * returns zip code to main
		 * 
		 * @return
		 */
		public String getZipCode() {
			return zip;
		}

		/**
		 * validates occupation
		 * 
		 * @param n
		 */
		public void setOcupation(String n) {
			if (!n.matches("^[A-Za-z ,.'-]+$")) {
				System.out.println("Invalid characters in occupation");
			} else {
				occupation = n;
			}
		}

		/**
		 * returns occupation to main
		 * 
		 * @return
		 */
		public String getOccupation() {
			return occupation;
		}

		
		

	}

}
