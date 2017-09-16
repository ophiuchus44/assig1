import java.util.Scanner;
import java.util.Date;


public class assig1
{
	public static void main (String [] args)
	{

		Scanner inScan = new Scanner(System.in);
///////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////// question 1 ///////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////		


		System.out.println("I can help the next person in line. Is there another customer? \n[Please response]");

		String customerQuestion = inScan.nextLine();

		String[] validResponse = { "1", "yes", "y","ya dude", "ya", "ok", "please wait", "si" , "one second!"};

		boolean customerReady = false; 

		// loop through the list of valid responses and check if first response 
		// given is a valid response 
		for (String s:validResponse){
			// if the first response given is found in the valid response list
			if (customerQuestion.equals(s)){
			// if true, this sets customer ready to true which will be used to
			// start or end the program
				customerReady = true;
			}
		}


		// now we check if customer is ready
		if (customerReady){
				//this was a check to make sure it is working properly
				System.out.println("We almost made it outside the first check!");
			}
		else{

			// If the customerReady = false then we exit the program
			// this means the response given in the previous for loop
			// was not found in the validresponse list
			// *** note: add time delay so if no response is given within certain amount of time exit
			System.out.println("I'm going on my break ;)");
			// get it?
			return;
		}
	
		// this checked that the valid response was given and we did not exit the program
		System.out.println("We made it outside the first check!");

///////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
////////////////// question 2 ////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("Are there any words you would like to pass me?");

		String password = "shazam 2000";

		String customerPassword = inScan.nextLine();

		//System.out.println(customerPassword);

		boolean specialCustomer = false;

//		int passwordCount = 0;

/////////////////////////////////////////////////
///////// ***** SUPER HACKED ******* ////////////
/////////////////////////////////////////////////		
/////////// COME BACK AND FIX THIS //////////////
/////////////////////////////////////////////////
/// i don't think the for loop is doing anything 
// 	and because there are only 2 checks, an if
// followed by and else with a nested if is basically 
// the 2 checks... couldn't adjust the number if we 
// wanted to change to 3 checks or 4 easily so thats
// why i'm not happy with this yet		

		for (int i = 0; i<2; i++){
			if (customerPassword.equals(password))
			{
				System.out.println("You entered " + customerPassword + " which is correct!");			
				specialCustomer = true;
				break;

			}
			else {
				System.out.println("Try again, you did not say the right password");
				i++;
				customerPassword = inScan.nextLine();
					if (customerPassword.equals(password))
					{
						System.out.println("You entered " + customerPassword + " which is correct!");			
						specialCustomer = true;
					}
			}
		}

// checks to make sure outcome of special customer is correct

	System.out.println("You made it outside the check " + customerPassword + " is " + specialCustomer);




/////////////////////////////////////////////////////////////////////////////////////////////////
////////////////// leaving the work i was playing with before settling on above hack ////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
		
		//while(passwordCount<1) {

		//	if (!customerPassword.equals(password))
		//	{
		//		System.out.println("Try again, you did not say the right password");
		//		passwordCount++;
		//		customerPassword = inScan.nextLine();
		//	}

		//	else {

		//		System.out.println("You entered " + customerPassword + " which is correct!");			
		//		specialCustomer = true;
		//		passwordCount = 3;
		//	}
		//}
		

//		System.out.println("You made it outside the check " + customerPassword + " is " + specialCustomer);

		//while (!customerPassword.equals(password) && passwordCount<3){
		//boolean passwordDone = false;

		//while (passwordDone){

		//	System.out.println("Try again, you did not say the right password");
		//	passwordCount++;
		//	customerPassword = inScan.nextLine();
		//	System.out.println(passwordCount);
		//	if (passwordCount==2){
		//		passwordDone = true;
		//	}	
		//	if(customerPassword.equals(password)){
//
//			System.out.println("You entered " + customerPassword + " which is correct!");			

//			}

			

			//if (customerPassword.equals(password)){
//			System.out.println("You entered " + customerPassword + " which is correct!");			
//			//}
//			else{
				
//				System.out.println("Try again, you did not say the right password");
//				passwordCount++;
//				customerPassword = inScan.nextLine();
//				System.out.println(passwordCount);

//				}
								
//				if (passwordCount >=1){
//					specialCustomer = false;
//				}
//				else {
//					specialCustomer = true;
//				}
			
/////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
///////////// QUESTION 3 /////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////


		}
	
	



	
	}

