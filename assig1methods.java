import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import javax.swing.JOptionPane;


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
	while (ready2go){
//		System.out.println("I'm going on my break :) ");
		//exits program if customer is not ready
//		return;


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

	//System.out.println("You are special? " + special);

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

			//menuChoice = inScan.nextLine();

			String temp = inScan.nextLine();
			menuChoice = Integer.parseInt(temp);

			//displayTotal(special);

			switch(menuChoice)
			{
				case 1:
					//System.out.println("You pressesed option 1");
					updatePins(special);

					// method for displaying the total at all times??
			//		dispalyTotal(special);
					break;
				case 2:
					//System.out.println("You pressesed option 2");
					updateQuaffles(special);
					//displayTotal(special);
					break;
				case 3:
					//System.out.println("You pressesed option 3");
					updateBroomstick(special);
					//displayTotal(special);
					break;
				case 4:
					//System.out.println("You pressesed option 4");
					//displayTotal(special);
					displayPrices(special);
					break;
				case 5:
					System.out.println("Your total bill is: ");

					break;
			}



		} while (menuChoice != 5);


		// CUSTOMER CHECKING OUT SECTION //
		displayTotal(special);

		System.out.println("****************************************");
		System.out.println("* Note 1: We Appreciate Exact change!  *");
		System.out.println("* Note 2: Recall our currency options: *");
		System.out.println("*        29 Knuts == 1 Sickle          *");
		System.out.println("* 17 Sickles == 1 Galleon == 493 Knuts *");
		System.out.println("****************************************");

		// method for giving receipt


///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("How would you like to pay? We accept Galleons, Sickles and Knuts");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// after customer checks out 





		// DELETE OLD CUSTOMER DATA
		
		deleteData();

		// NEXT CUSTOMER //

		System.out.println("I can help the next person in line. Is there another customer? \n[say: yes, or ya, or ok, or si, or y, or ya dude, or 1]");


		customerQuestion = inScan.nextLine();

		//boolean ready2go;
		// initialize method customerReady, pass the argument customerQuestion
		// and set to variable ready2go with boolean result 

		ready2go = customerReady(customerQuestion);
		System.out.println(ready2go);





	}



		System.out.println("I'm going on my break :) ");
		//exits program if customer is not ready
		




		return;





		// print receipt/ displayTotal



		//deleteData();

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
	public static int updatePins(boolean special){
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

					displayTotal(special);
					break;
				case 2:
					System.out.println("How many Slytherin pins would you like?");
					int order2 = inScan.nextInt();
					int option2 = 2;
					add2Total(menuCategory,option2,order2);
					add2StoreTotal(menuCategory,option2,order2);
					displayTotal(special);

					break;
				case 3:
					System.out.println("How many Hufflepuff pins would you like?");
					int order3 = inScan.nextInt();
					int option3 = 3;
					add2Total(menuCategory,option3,order3);
					add2StoreTotal(menuCategory,option3,order3);
					displayTotal(special);

					break;
				case 4:
					System.out.println("How many Ravenclaw pins would you like?");
					int order4 = inScan.nextInt();
					int option4 = 4;
					add2Total(menuCategory,option4,order4);
					add2StoreTotal(menuCategory,option4,order4);
					displayTotal(special);

					break;
				case 5:
					System.out.println("Back to Main Menu!");
					displayTotal(special);

					break;
			}

		} while (menuChoice != 5);

//		return totalCount_Pin_Gryffindor;
		return menuCategory;
	}



	public static int updateQuaffles(boolean special){
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
					displayTotal(special);

					break;
				
			}

		} while (menuChoice != 2);

		return menuCategory;
	}

public static int updateBroomstick(boolean special){
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
			// probably could have passed inScan as parameter/argument
			// in method
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
					displayTotal(special);

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

	public static void displayTotal(boolean special){

		

		//String fileLocation = "customerBill.txt";

	try{
		FileReader fr = new FileReader("customerBill.txt");
		BufferedReader br = new BufferedReader(fr);
		//BufferedReader br = new BufferedReader(new FileReader("customerBill.txt"));
//		String aLineFromFile = null;

		String line;

		int pin1Total=0;
		int pin2Total=0;
		int pin3Total=0;
		int pin4Total=0;
		int quaffleTotal=0;
		int quaffleBoxTotal = 0;
		int broomTotal=0;


		int totalPinCount = 0;

		int pin1TotalCost=0;
		int pin2TotalCost=0;
		int pin3TotalCost=0;
		int pin4TotalCost=0;


// in knuts
		
		int regQuaffleCost = 145;
		int regQuaffleBoxCost = 638;
		int regBroomCost = 986;
		int specQuaffleBoxCost = 580; 
		int specBroomCost = 899;



		int broomTotalCost = 0;
		int quaffleTotalCost = 0;



		int totalBill = 0;

		while ((line = br.readLine()) != null){
////////////////////////////////////////////////////////////////////////////////////			
////////////////////////////////////////////////////////////////////////////////////			
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
		// instead of printing, need to manipulate based on special

		//	JOptionPane.showMessageDialog(null, line);

			//method for converting txt to bill
			//System.out.println(line);



			// store future values of orders in here

			String category = convertCategory(line);
			String orderAmount = convertOrderAmount(line);

			int orderInt = Integer.parseInt(orderAmount);



			if(category.equals("Gryffindor Pin(s): ")){
				pin1Total += orderInt;
				totalPinCount += orderInt;
			}
			else if(category.equals("Slytherin Pin(s): ")){
				pin2Total += orderInt;
				totalPinCount += orderInt;
			}
			else if(category.equals("Hufflepuff Pin(s): ")){
				pin3Total += orderInt;
				totalPinCount += orderInt;
			}
			else if(category.equals("Ravenclaw Pin(s): ")){
				pin4Total += orderInt;
				totalPinCount += orderInt;
			}
			else if(category.equals("Quaffle(s): ")){
				quaffleTotal += orderInt;
				if(quaffleTotal>4){
					quaffleBoxTotal = quaffleTotal/ 5;
					// should have returned 0 if box count went to one but didn't display
					// anything until the next order came in... so it works but not initially
					// just going to keep this commented out for now, I think its fine that
					// it says how many quaffles you have and the total boxes
					//quaffleTotal = quaffleTotal % 5;
				}
				//quaffleTotal = quaffleTotal % 5;
			}
			else if(category.equals("Broomstick Kit(s): ")){
				broomTotal += orderInt;
			}

			//System.out.println(category + orderAmount);

			//System.out.println(category + pin1Total);
//			System.out.println("Gryffindor Pin(s): " + pin1Total);
//			System.out.println("Slytherin Pin(s): " + pin2Total);
//			System.out.println("Hufflepuff Pin(s): " + pin3Total);
//			System.out.println("Ravenclaw Pin(s): " + pin4Total);

			//System.out.printf(orderAmount);


////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////			
//		}
		
		}
		// only display if orders made
			System.out.println("**************************************");
			System.out.println("********** CUSTOMER RECEIPT **********");
			System.out.println("**************************************");

			
			if((totalPinCount>0) && special && (totalPinCount>=10)){
				System.out.println("Total Pin Order: " + totalPinCount + " ( **Discounted Prices**)");
			}
			else if ((totalPinCount>0) && special && (totalPinCount<10)) {
				System.out.println("Total Pin Order: " + totalPinCount);

			}
			if((totalPinCount>0) && !special){
				System.out.println("Total Pin Order: " + totalPinCount);	
			}




			if(pin1Total>0){

				// method that totals up??
				//totalDue(pin1Total);
				//System.out.println("Gryffindor Pin(s): " + pin1Total);
				// if special and order above min
				if(special && (totalPinCount>=10)){
					pin1TotalCost = pin1Total* 18;
				}
				// special customer but didn't order min amount for discount
				else if(special && (pin1Total<10)){
					pin1TotalCost = pin1Total *20;
				}	
				// not special customer cost
				else if(!special){
					pin1TotalCost = pin1Total * 20;
				}
				System.out.println("	Gryffindor Pin(s): " + pin1Total);
				System.out.println("	Gryffindor Pin(s) Total Cost: " + pin1TotalCost + " Knuts");

			}
			if(pin2Total>0){

				if(special && (totalPinCount>=10)){
					pin2TotalCost = pin2Total* 18;
				}
				// special customer but didn't order min amount for discount
				else if(special && (pin2Total<10)){
					pin2TotalCost = pin2Total *20;
				}	
				// not special customer cost
				else if(!special){
					pin2TotalCost = pin2Total * 20;
				}
				
				System.out.println("	Slytherin Pin(s): " + pin2Total);	
				System.out.println("	Slytherin Pin(s) Total Cost: " + pin2TotalCost + " Knuts");	

			}
			if(pin3Total>0){
				if(special && (totalPinCount>=10)){
					pin3TotalCost = pin3Total* 18;
				}
				// special customer but didn't order min amount for discount
				else if(special && (pin3Total<10)){
					pin3TotalCost = pin3Total *20;
				}	
				// not special customer cost
				else if(!special){
					pin3TotalCost = pin3Total * 20;
				}
				System.out.println("	Hufflepuff Pin(s): " + pin3Total);
				System.out.println("	Hufflepuff Pin(s) Total Cost: " + pin3TotalCost + " Knuts");	
				
			}
			if(pin4Total>0){
				if(special && (totalPinCount>=10)){
					pin4TotalCost = pin4Total* 18;
				}
				// special customer but didn't order min amount for discount
				else if(special && (pin4Total<10)){
					pin4TotalCost = pin4Total *20;
				}	
				// not special customer cost
				else if(!special){
					pin4TotalCost = pin4Total * 20;
				}
				System.out.println("	Ravenclaw Pin(s): " + pin4Total);
				System.out.println("	Ravenclaw Pin(s) Total Cost: " + pin4TotalCost + " Knuts");	
				
			}
			if(quaffleTotal>0){
				//if(special){
				//	quaffleTotalCost = specQuaffleBoxCost;
				//}
				//else if(!special){
				//	quaffleTotalCost = regQuaffleCost
				//}

				if(special){

					quaffleTotal = quaffleTotal % 5;
					quaffleTotalCost += specQuaffleBoxCost * quaffleBoxTotal;
					quaffleTotalCost += regQuaffleCost * quaffleTotal;
				}
				else if(!special){
					quaffleTotal = quaffleTotal % 5;
					quaffleTotalCost += regQuaffleBoxCost * quaffleBoxTotal;
					quaffleTotalCost += regQuaffleCost * quaffleTotal;
				}


				System.out.println("Quaffle(s): " + quaffleTotal);	
				System.out.println("Quaffle Box(s): " + quaffleBoxTotal);
				System.out.println("Quaffle Box(s) Total: " + quaffleTotalCost);

			}
			if(broomTotal>0){
				System.out.println("Broomstick Kit(s): " + broomTotal);	

				if(special){
					broomTotalCost = specBroomCost * broomTotal;
				}
				else if(!special){
					broomTotalCost = regBroomCost * broomTotal;
				}
				
				System.out.println("Broomstick Kit(s) Total: " + broomTotalCost + " Knuts");	

			}

			System.out.println("**************************************");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
			/// need to return outside function so i can accept payment with amount
			totalBill += (broomTotalCost + quaffleTotalCost + pin1TotalCost + pin2TotalCost + pin3TotalCost + pin4TotalCost);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

			System.out.println("-----   Total Bill Due: " + totalBill + "   -----");
			
			System.out.println("**************************************");
			

		fr.close();
	}
	catch (IOException e){
		e.printStackTrace();
	}
		
}


	
public static String convertCategory(String line){
	
	//String upToNCharacters = s.substring(0, Math.min(s.length(), 3));
	String category = "";

	String categoryIDs = line.substring(0,3);
	
	//String orderAmount = line.substring(3,7);


	if(categoryIDs.equals("1,1")){
		category = "Gryffindor Pin(s): ";
	}
	else if(categoryIDs.equals("1,2")){
		category = "Slytherin Pin(s): ";
	}
	else if(categoryIDs.equals("1,3")){
		category = "Hufflepuff Pin(s): ";
	}
	else if(categoryIDs.equals("1,4")){
		category = "Ravenclaw Pin(s): ";
	}
	else if(categoryIDs.equals("2,1")){
		category = "Quaffle(s): ";
	}
	else if(categoryIDs.equals("3,1")){
		category = "Broomstick Kit(s): ";
	}
	
	return category;
}

public static String convertOrderAmount(String line){
	
	String orderAmount = "";
	// grabs all numbers passed 4th position up to lenght of string
	orderAmount = line.substring(4,line.length());
	return orderAmount;
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
// none currently



/////////// next steps

// need to extract total bill in knuts to main so an acceptPayment(totalBill) 
// method can be called after display



