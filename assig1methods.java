import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class assig1methods
{
	public static void main (String [] args)
	{

	Scanner inScan = new Scanner(System.in);
	System.out.println("I can help the next person in line. Is there another customer? \n[say: yes, or ya, or ok, or si, or y, or ya dude, or 1]");


/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////
/////// question 1 	
/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////


/// Prob need a while loop to encapsolate all of main to check for !done
/// to keep looping back to start of sequence of method calls


	String customerQuestion = inScan.nextLine();

	boolean ready2go;
	// initialize method customerReady, pass the argument customerQuestion
	// and set to variable ready2go with boolean result 
	ready2go = customerReady(customerQuestion);
	System.out.println(ready2go);


///////////////////////////////////////////////////////////////////////////////////
// if customer response is invalid, customer is not ready2go and we exit program //
///////////////////////////////////////////////////////////////////////////////////	
	while (!ready2go){
		System.out.println("I'm going on my break :) ");
		//exits program if customer is not ready
		return;
	}


/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////
//////// question 2
/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////

	System.out.println("Are there any words you would like to pass me?");

	String customerPassword = inScan.nextLine();

	boolean special;

	// store method call of specialCustomer with the customerPassword
	special = specialCustomer(customerPassword);

	System.out.println("You are special? " + special);

	if(!special){
		System.out.println("Hmm... I'll give you one more chance");
		customerPassword = inScan.nextLine();
		special = specialCustomer(customerPassword);
	}

	System.out.println("You are special? " + special);

	String customerType;
	if(special){
		customerType = "special";
	}
	else
	{
		customerType = "regular";
	}

/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////
//////// question 3
/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////


//	int totalCount_Pin_Gryffindor;
///	int totalCount_Pin_Slytherin;
//	int totalCount_Pin_Hufflepuff;
//	int totalCount_Pin_Ravenclaw;
	
//	int totalCount_Quaffles;

//	int totalCount_Brooms;
/////////////////////////////////////////
	//update totals with orders???
	// append to list or just update count
/////////////////////////////////////////


	System.out.println("Next question " + customerType + " type of customer");

	int menuChoice=0;

	do
		{
			System.out.println("Please Choose an option:");
			System.out.println("1) Update House Pins Order");
			System.out.println("2) Update Quaffles Order");
			System.out.println("3) Update Broomstick Service Kits Order");
			System.out.println("4) Show Price List");
			System.out.println("5) Check Out");

			menuChoice = inScan.nextInt();

			switch(menuChoice)
			{
				case 1:
					//System.out.println("You pressesed option 1");
					updatePins();

					// method for displaying the total at all times??
					//dispalyTotal();
					break;
				case 2:
					//System.out.println("You pressesed option 2");
					updateQuaffles();
					break;
				case 3:
					//System.out.println("You pressesed option 3");
					updateBroomstick();
					break;
				case 4:
					//System.out.println("You pressesed option 4");
					displayPrices(special);
					break;
				case 5:
					System.out.println("You pressesed option 5... good bye!");
					break;
			}

		} while (menuChoice != 5);


		// method for giving receipt

		System.out.println("****************************************");
		System.out.println("* Note 1: We Appreciate Exact change!  *");
		System.out.println("* Note 2: Recall our currency options: *");
		System.out.println("*        29 Knuts == 1 Sickle          *");
		System.out.println("* 17 Sickles == 1 Galleon == 493 Knuts *");
		System.out.println("****************************************");

		// print receipt/ displayTotal



		deleteData();

		// if 5 is pressed currently exits... but needs to be included in 
		// larger loop that checks for customer first 





	
	//String menu;

	// should run method with argument special true/false that returns proper prices
	//menu = priceList(special);

	// and display the menu
	
	//int choice = inScan.nextInt();
	//int menu = mainMenu(choice);
	//System.out.println(mainMenu(choice));
	//System.out.println(menu);

//	System.out.println()


////////////////
/// MAIN END ///
	}
////////////////
/////////////////



/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////
/////////// method for question 1
/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////

	public static boolean customerReady(String cQuestion){
		//System.out.println("I can help the next person in line. Is there another customer? \n[say yes, or ya, or ok, or si, or y, or ya dude, or 1]");
		

		String[] validResponse = { "1", "yes", "y","ya dude", "ya", "ok", "si"};

		boolean ready = false;
// loop through the list of valid responses and check if first response 
		// given is a valid response 
		for (String s:validResponse){
			// if the first response given is found in the valid response list
			if (cQuestion.toLowerCase().equals(s)){
			// if true, this sets customer ready to true which will be used to
			// start or end the program
				ready = true;
			}
		}

		return ready;

	}

//		if (!ready){
//			ready = false;
//		}



		// now we check if customer is ready
//		if (ready){
				//this was a check to make sure it is working properly
//				System.out.println("We almost made it outside the first check!");
//			}
//		else{

			// If the customerReady = false then we exit the program
			// this means the response given in the previous for loop
			// was not found in the validresponse list
			// *** note: add time delay so if no response is given within certain amount of time exit
		//	System.out.println("I'm going on my break ;)");
			
//			ready = false;
//		}
	
		// this checked that the valid response was given and we did not exit the program
	//	System.out.println("We made it outside the first check!");

//		return ready;
//	}

/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////
/////////// method for question 2
/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////
	public static boolean specialCustomer(String cPassword){

	String password = "ddd";
	boolean specialC = false;

	if(cPassword.toLowerCase().equals(password)){

		System.out.println("You entered " + cPassword + " which is correct!");			

		specialC = true;
	}

	return specialC;

	}


/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////
/////////// method for question 3 - price list
/////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////
	public static int updatePins(){
		System.out.println("For which team would you like to order pins?");

		int menuChoice=0;

/////////////////////////////////////////////////////
////////// menuCategory 1 is the ID for Pins///////////
/////////////////////////////////////////////////////		
		int menuCategory = 1;
/////////////////////////////////////////////////////
////////////////////////////////////////////////////



	do
		{
			System.out.println("1) Gryffindor");
			System.out.println("2) Slytherin");
			System.out.println("3) Hufflepuff");
			System.out.println("4) Ravenclaw");
			System.out.println("5) Finished with Pin order");

//////////////////////////////////////////////////////////////////////
			// why doesn't inScan inherit from main? .... hmmm
			Scanner inScan = new Scanner(System.in);

			menuChoice = inScan.nextInt();





////////////////////////////////////////////////////////////////////////
			switch(menuChoice)
			{
				case 1:
					System.out.println("How many Gryffindor pins would you like?");
					int order1 = inScan.nextInt();
					// for tracking data later on
					int option1 = 1;
					
					//method for sending order data to csv
					// i want to be able to see a history of their order
					// so i can offer deleting orders in a method that would
					// read the csv... i prob wont have time for all that
					// but i still want to write to csv for now so i could do it 
					// if i wanted to 
					add2Total(menuCategory,option1,order1);
					add2StoreTotal(menuCategory,option1,order1);
					break;
				case 2:
					System.out.println("How many Slytherin pins would you like?");
					int order2 = inScan.nextInt();
					int option2 = 2;
					add2Total(menuCategory,option2,order2);
					add2StoreTotal(menuCategory,option2,order2);
					break;
				case 3:
					System.out.println("How many Hufflepuff pins would you like?");
					int order3 = inScan.nextInt();
					int option3 = 3;
					add2Total(menuCategory,option3,order3);
					add2StoreTotal(menuCategory,option3,order3);
					break;
				case 4:
					System.out.println("How many Slytherin pins would you like?");
					int order4 = inScan.nextInt();
					int option4 = 4;
					add2Total(menuCategory,option4,order4);
					add2StoreTotal(menuCategory,option4,order4);
					break;
				case 5:
					System.out.println("You pressesed option 5... good bye!");
					break;
			}

		} while (menuChoice != 5);

//		return totalCount_Pin_Gryffindor;
		return menuCategory;
	}



	public static int updateQuaffles(){
		//System.out.println("How many Quaffles would you like?");

		int menuChoice=0;

/////////////////////////////////////////////////////
////////// menuCategory 2 is the ID for Quaffles ///////////
/////////////////////////////////////////////////////		
		int menuCategory = 2;
/////////////////////////////////////////////////////
////////////////////////////////////////////////////



	do
		{
			System.out.println("1) Order Quaffles");
			System.out.println("2) Return to Main Menu");

//////////////////////////////////////////////////////////////////////
			// why doesn't inScan inherit from main? .... hmmm
			Scanner inScan = new Scanner(System.in);

			menuChoice = inScan.nextInt();





////////////////////////////////////////////////////////////////////////
			switch(menuChoice)
			{
				case 1:
					System.out.println("How many Quaffles would you like?");
					int order1 = inScan.nextInt();
					// for tracking data later on
					int option1 = 1; 
					add2Total(menuCategory,option1,order1);
					add2StoreTotal(menuCategory,option1,order1);
					break;
				
			}

		} while (menuChoice != 2);

		return menuCategory;
	}

public static int updateBroomstick(){
		//System.out.println("How many Quaffles would you like?");

		int menuChoice=0;

/////////////////////////////////////////////////////
////////// menuCategory 2 is the ID for Quaffles ///////////
/////////////////////////////////////////////////////		
		int menuCategory = 3;
/////////////////////////////////////////////////////
////////////////////////////////////////////////////



	do
		{
			System.out.println("1) Order Broomstick");
			System.out.println("2) Return to Main Menu");

//////////////////////////////////////////////////////////////////////
			// why doesn't inScan inherit from main? .... hmmm
			Scanner inScan = new Scanner(System.in);

			menuChoice = inScan.nextInt();





////////////////////////////////////////////////////////////////////////
			switch(menuChoice)
			{
				case 1:
					System.out.println("How many Broomsticks would you like?");
					int order1 = inScan.nextInt();
					// for tracking data later on
					int option1 = 1; 
					add2Total(menuCategory,option1,order1);
					add2StoreTotal(menuCategory,option1,order1);
					break;
				
			}

		} while (menuChoice != 2);

		return menuCategory;
	}

	public static void displayPrices(boolean special){
		//System.out.println("How many Quaffles would you like?");

		int menuChoice=0;

	if(special){
	do
		{
			System.out.println("1) Display Prices");
			System.out.println("2) Return to Main Menu");

//////////////////////////////////////////////////////////////////////
			// why doesn't inScan inherit from main? .... hmmm
			Scanner inScan = new Scanner(System.in);

			menuChoice = inScan.nextInt();





////////////////////////////////////////////////////////////////////////
			switch(menuChoice)
			{
				case 1:
					System.out.println("*****************************************************************************************************");
					System.out.println("Overall, 10% off over and above any other discounts if the overall order (after other discounts) " + 
						"is 3 Galleons or more, rounded to the nearest Knut");
					System.out.println("*****************************************************************************************************");
					System.out.println("House Pins (each):  			20 Knuts");
					System.out.println("if 10 or more purchase:    		18 Knuts");
					System.out.println("Quaffles (each):       			145 Knuts");
					System.out.println("Quaffles (box of 5):       		580 Knuts"); 
					System.out.println("Broomstick Service Kits (each):	899 Knuts");

					System.out.println("****************************************");
					System.out.println("* Note 1: We Appreciate Exact change!  *");
					System.out.println("* Note 2: Recall our currency options: *");
					System.out.println("* 		29 Knuts == 1 Sickle   	       *");
					System.out.println("* 17 Sickles == 1 Galleon == 493 Knuts *");
					System.out.println("****************************************");
					break;
				
			}

		} while (menuChoice != 2);
	}
	else{
		do
		{
			System.out.println("1) Display Prices");
			System.out.println("2) Return to Main Menu");

//////////////////////////////////////////////////////////////////////
			// why doesn't inScan inherit from main? .... hmmm
			Scanner inScan = new Scanner(System.in);

			menuChoice = inScan.nextInt();





////////////////////////////////////////////////////////////////////////
			switch(menuChoice)
			{
				case 1:
					System.out.println("House Pins (each):  			20 Knuts");
					System.out.println("Quaffles (each):       			145 Knuts");
					System.out.println("Quaffles (box of 5):       		638 Knuts"); 
					System.out.println("Broomstick Service Kits (each): 986 Knuts");

					System.out.println("****************************************");
					System.out.println("* Note 1: We Appreciate Exact change!  *");
					System.out.println("* Note 2: Recall our currency options: *");
					System.out.println("*        29 Knuts == 1 Sickle          *");
					System.out.println("* 17 Sickles == 1 Galleon == 493 Knuts *");
					System.out.println("****************************************");
					break;
				
			}

		} while (menuChoice != 2);
	}




		//return menuCategory;
	}




/// methods to do list
// will have to write a method for reading from test.txt for calculating totals
// displaying current totals, and for 'printing receipt'



// should only need to pass isSpecial in
//runningTotal(isSpecial)
	//if special = true;
	//	return savings
	//else 
		//return whatYouWouldHaveSaved

//grab test.txt and covnvert to readable 
//	coverter needed to take values from txt and put back into


// no matter if true or false, it'll gt passed 
// and return if the customer gets discount or not
//finalBill(isSpecial)



// payBill - something that after reading finalBill allows you to pay


// savings for being special or vice versa, what you could have saved if not special


// methods wish list

// delete records (customer)
	// prob don't need this because records are entered individually to a mster
	// and if deleted, maybe give them a tag of some sort to keep track?? 






//////////// ********************************************** //////////////
//////////////////////////////////////////////////////////////////////////
/// need a method for deleting test.txt file after the customer leaves....
//////////////////////////////////////////////////////////////////////////
//////////// ********************************************** //////////////

	public static void deleteData(){
		String path = "customerBill.txt";
      try{

    		File file = new File(path);

    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}

    	}catch(Exception e){

    		e.printStackTrace();

    	}
   }
	



/// method for adding to CSV file order data

	public static void add2Total(int category, int option, int order){


		//String total;
		
		//boolean done = false;
		try{


		System.out.println("Category_ID " + category + ", Option_ID " + option + ", Order_Amount " + order);


		String categoryString = Integer.toString(category);
		String optionString = Integer.toString(option);
		String orderString = Integer.toString(order);


		String filePath = "customerBill.txt";

		FileWriter fw = new FileWriter(filePath, true);

		BufferedWriter bw = new BufferedWriter(fw);

		PrintWriter pw = new PrintWriter(bw);

// write to txt file
		pw.println(categoryString + "," + optionString + "," + orderString);

		pw.flush();
		pw.close();

		System.out.println("(Record Saved)");
	}
	catch(IOException e){
		e.printStackTrace();
	}



	}


/// method for adding to CSV file storeHistory of order data

	public static void add2StoreTotal(int category, int option, int order){


		//String total;
		
		//boolean done = false;
		try{


		System.out.println("Category_ID " + category + ", Option_ID " + option + ", Order_Amount " + order);


		String categoryString = Integer.toString(category);
		String optionString = Integer.toString(option);
		String orderString = Integer.toString(order);

		//String customerID 

		String filePath = "storeHistory.txt";

		FileWriter fw = new FileWriter(filePath, true);

		BufferedWriter bw = new BufferedWriter(fw);

		PrintWriter pw = new PrintWriter(bw);

		pw.println(categoryString + "," + optionString + "," + orderString);

		pw.flush();
		pw.close();

		System.out.println("(Record Saved)");
	}
	catch(IOException e){
		e.printStackTrace();
	}



	}



/////

	public static void dispalyTotal()throws IOException{

		

		//String fileLocation = "customerBill.txt";


		FileReader fr = new FileReader("customerBill.txt");
		BufferedReader br = new BufferedReader(fr);
		//BufferedReader br = new BufferedReader(new FileReader("customerBill.txt"));
//		String aLineFromFile = null;

		String line;
		while ((line = br.readLine()) != null){
			System.out.println(line);
//		}
		fr.close();
		
		}
	}

	


		


////////////////	
////////////////
////////////////
}		////////
////////////////
/// END } //////
////////////////


/// public static void methodName = procedure
/// public static boolean/int methodName = function
	





//////////// major problems
//////// can't read data back in to do next step of conversions and payment
/////// need to get info out of txt file....
/////////

