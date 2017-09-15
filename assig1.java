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

		System.out.println("Time for the password");
	
	}

}

