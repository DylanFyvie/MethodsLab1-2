import java.util.Scanner;

/**
 * Name: Dylan Fyvie
 * Teacher: Mr. Hardman
 * Assignment 6, Program #3
 * Date Last Modified: 12/15/2016
 */

/**
 * @author d.fyvie
 *
 */
public class Ryan_Kesler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner userInput = new Scanner(System.in);
			
			int userNumber;
			boolean Prime;
			
			System.out.println("Please enter a number for being a prime");
			userNumber = userInput.nextInt();
			Prime = isPrime(userNumber);
			
			if(Prime == false){
				System.out.println("Your number is not a prime number");
			} else{
				System.out.println("Your number is a prime number");
			}
			userInput.close();	
	}

	private static boolean isPrime(int userNumber) {
		// TODO Auto-generated method stub
		boolean prime = true;
		
		for(int i = 2; prime && i<+ Math.sqrt(userNumber); i++){
			if(userNumber %i ==0){
				prime = false;
			}
		}
	
	return (prime);
	}
}
