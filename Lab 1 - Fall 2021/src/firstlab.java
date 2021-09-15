import java.util.Scanner;

class firstlab {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Has this Year Happened Tool!");
		System.out.println("");
		System.out.println("Please enter year after 1 AD");
		
		int year = keyboard.nextInt();
		
		if(year > 2021) {
			System.out.println("That year hasnt happened yet.");
		}
		
		else if(year < 2021) {
			System.out.println("That year has already happened.");
		}
		else {
			System.out.println("That is the current year, hope its been a good one!");
		}
		
		System.out.println("");
		System.out.println("Thank you for using the Has this Year Happened Tool!");
	
	}
}
