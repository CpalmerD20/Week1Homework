
public class App {

	public static void main(String[] args) {
		// Week 1 Java Coding Assignment
		// Steps 1 & 2 were creating the project
		
		//Step 3: create two variables and assign values
		int numberOfFriends = 202;
		int myAge = 31;
		/* 
		 * I'm choosing int because friends come in integers
		 * I wouldn't know how to explain 201.12 friends 
		 */
		double walletMoney = 181.88;
		double newDiceSet = 15.99;
		/*
		 * I'm using double because that is the
		 * curriculum recommended variable for rational numbers
		 * Note: Oracle recommends against using double for currency
		 */
		String firstName = "Steve";
		char middleIni = 'P';
		String lastName = "Jobs";
		/*
		 * String is perfect for first and last names
		 * for middle initial I chose char
		 */
		
		//Step 4 create new variables by performing operations
		//Step 4a
		double newWalletMoney = walletMoney - newDiceSet;
		// calculating how much money would be left over.
				
		//Step 4b
		int friendsPerYear = numberOfFriends / myAge;
		// calculating how many whole friends I've made per year
		
		//Step 4c
		String steveJobs = firstName +" "+ middleIni +" "+ lastName;
		// using arithmetic operators to make a full name
		
		//Step 5 Print out the values
		System.out.println("In my wallet, I now have " + newWalletMoney);
		System.out.println("Wow! Each year I've made about "+ friendsPerYear +" friends");
		System.out.println(steveJobs + " will always be remembered");
	}

}
