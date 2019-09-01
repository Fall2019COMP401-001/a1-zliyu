package a1;
import java.util.Scanner;

public class A1Novice {
	
	public static void main(String[] args){
		
		//Set up scanner object to read order information
		//from console input
		Scanner scan = new Scanner(System.in);

		//The number of customers
		int num = scan.nextInt();
		
		//Store the names of customers
		String[] names = new String[num];
		//Store the money each customer spends
		String[] money = new String[num];
		
		//i: the #i customer
		//Loop i times
		for (int i = 0; i < num; i++) {
			
			//Get first and last name
			String first = scan.next();
			String last = scan.next();
			names[i] = first.charAt(0) + ". " + last;
				
			//Get the number of different items bought
			int items = scan.nextInt();
			
			//Total money this customer spends
			double total = 0;
			money[i] = "";
			
			//Calculate total money this customer spends
			for (int j = 0; j < items; j++) {
				int amount = scan.nextInt();
				
				//Skip item name
				scan.next();

				double price = scan.nextDouble();
				total += amount * price; //NOT '=+'
			}
			
			//Convert to correct format and add to array
			money[i] = money[i] + String.format("%.2f", total); //?
			//Print out results
			System.out.println(names[i] + ": " + money[i]);
		}
		
		//End scanner
		scan.close();
				
	}		
}
