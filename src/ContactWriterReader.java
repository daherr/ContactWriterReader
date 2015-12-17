import java.io.*; // allows for all java.io objects 
import java.util.Scanner; // allows for the scanner object
import java.util.stream.Stream; // allows for the java stream object

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
	 * @author David Herr This class jumps to the validation class and 
	 * writes the input to a text file, and then during
	 * then reads the file back through all other runs of the program
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		String input = null; // variable for users input
		Scanner keyboard = new Scanner(System.in); // creates Scanner Object
		File myFile = new File( "myOutputFile.txt" ); // creates a new file
		String inputString; // creates string for inputs
		int inputInt = 0; // creates the pointer int for the storeArray class
		BufferedReader inputFile; // creates a reference to the BufferedReader
		int c = 1; // counter int 
		Contact [] storeArray = new Contact [25]; // creates a new array for contact objects
		char choice; // creates a variable for the choice of the user's choice on whether tocontinue or not 
		PrintWriter myWriter; // creates a reference to the print writer
		int i = 0; // int variable for incrementing
		
		System.out.println( "Welcome to the new and improved contact class!!! " );
		
		if( !myFile.exists() ){
			
			do{
				
				storeArray [inputInt] = new Contact() ;// creates new object for the array
				
				System.out.print("Enter the last name: ");
				input = keyboard.nextLine(); // changes value of input
			
				storeArray[inputInt].setLastName(input);// adds the last name to the array						

				System.out.print("Enter the first name: ");
				input = keyboard.nextLine(); // changes value of input
				
				storeArray[inputInt].setFirstName(input);// adds the first name to the array

				System.out.print("Enter the Middle name: ");
				input = keyboard.nextLine(); // changes value of input
				
				storeArray[inputInt].setMiddleName(input); // adds the middle name to the array

				System.out.print("Enter the prefix (if you have none, input none): ");
				input = keyboard.nextLine(); // changes value of input
				storeArray[inputInt].setPrefix(input); // sends input to setPrefix method to be validated

				storeArray[inputInt].setPrefix(input); // adds the prefix to the array

				System.out.print("Enter the phone number: ");
				input = keyboard.nextLine(); // changes value of input

				storeArray[inputInt].setPhoneNum(input); // adds the phone number to the array

				System.out.print("Enter the Email: ");
				input = keyboard.nextLine(); // changes value of input

				storeArray[inputInt].setEmail(input); // adds the email to the array
				
				System.out.print("Enter the Street: ");
				input = keyboard.nextLine(); // changes value of input
				
				storeArray[inputInt].setStreet(input); // adds the street to the array
				
				System.out.print("Enter the City: ");
				input = keyboard.nextLine(); // changes value of input

				storeArray[inputInt].setCity(input); // adds the city to the array

				System.out.print("Enter the State: ");
				input = keyboard.nextLine(); // changes value of input

				storeArray[inputInt].setState(input); // adds the state to the array

				System.out.print("Enter the Zip Code: ");
				input = keyboard.nextLine(); // changes value of input

				storeArray[inputInt].setZipCode(input); // adds the zip code to the array

				System.out.print("Enter the Occupation: ");
				input = keyboard.nextLine(); // changes value of input

				storeArray[inputInt].setOcupation(input); // adds the occupation to the array
				
				++inputInt; // increments the inputInt variable
				
				System.out.print( "Would you like to continue inputting contacts?" 
						+ " press y to continue and n to quit " ); // asks user if they want to continue adding contacts
				choice = keyboard.nextLine().toLowerCase().charAt(0); // takes the users input, puts it in lower case and takes the first character
				
				}while( choice == 'y' );
				 
			myWriter = new PrintWriter(myFile);
				for( c = 0; c < inputInt; c++ ){
					
					myWriter.println( storeArray[c].getLastName()); // writes last name to the file
					myWriter.println( storeArray[c].getFirstName()); // writes the first name to the file
					myWriter.println( storeArray[c].getMiddleName());// writes the middle name to the file
					myWriter.println( storeArray[c].getPrefix());// writes the prefix to the file
					myWriter.println( storeArray[c].getPhoneNum());// writes the phone number to the file
					myWriter.println( storeArray[c].getEmail()); // writes the email to the file
					myWriter.println( storeArray[c].getStreet());// writes the street to the file
					myWriter.println( storeArray[c].getCity());// writes the city to the file
					myWriter.println( storeArray[c].getState());// writes the state to the file
					myWriter.println( storeArray[c].getZipCode());// writes the zip code to the file
					myWriter.println( storeArray[c].getOccupation());// writes the occupation to the file
					
				}
				myWriter.close();
		}else{
			
			inputFile = new BufferedReader( new FileReader( myFile )); // creates a new buffered reader 
			while(  inputFile.ready() ){ // .ready tells whether the file is able to be ready
				// Takes each line of text from the text file and stores it in contact objects, which get stored in the array storeArray
				
				storeArray[inputInt] = new Contact() ;// creates new object for the array
			
				input = inputFile.readLine();
				storeArray[inputInt].setLastName(input);
				
				input = inputFile.readLine();
				storeArray[inputInt].setFirstName(input);
				
				input = inputFile.readLine();
				storeArray[inputInt].setMiddleName(input);
				
				input = inputFile.readLine();
				storeArray[inputInt].setPrefix(input);
				
				input = inputFile.readLine();
				storeArray[inputInt].setPhoneNum(input);
				
				input = inputFile.readLine();
				storeArray[inputInt].setEmail(input);
				
				input = inputFile.readLine();
				storeArray[inputInt].setStreet(input);
				
				input = inputFile.readLine();
				storeArray[inputInt].setCity(input);
				
				input = inputFile.readLine();
				storeArray[inputInt].setState(input);
				
				input = inputFile.readLine();
				storeArray[inputInt].setZipCode(input);
				
				input = inputFile.readLine();
				storeArray[inputInt].setOcupation(input);
				
				inputInt++;
			}
			
			inputFile.close();
			
			for( c = 0; c < inputInt; c++ ){
			
				System.out.println( storeArray[c].getLastName()); // prints last name 
				System.out.println( storeArray[c].getFirstName()); // prints first name 
				System.out.println( storeArray[c].getMiddleName());// prints middle name
				System.out.println( storeArray[c].getPrefix());// prints prefix
				System.out.println( storeArray[c].getPhoneNum());// prints phone number
				System.out.println( storeArray[c].getEmail()); // prints email
				System.out.println( storeArray[c].getStreet());// prints street 
				System.out.println( storeArray[c].getCity());// prints city 
				System.out.println( storeArray[c].getState());// prints state 
				System.out.println( storeArray[c].getZipCode());// prints zip code 
				System.out.println( storeArray[c].getOccupation());// prints occupation
				
			}
		}
		System.exit(0); // exits the program
	}
			

	public static class Contact {
		
		String lName, fName, mName; // variables for last, first, and middle name
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