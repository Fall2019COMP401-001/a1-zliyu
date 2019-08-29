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
			
			//Get first name
			String first = scan.next();
			//Get lash name
			String last = scan.next();
			//Add name to array
			names[i] = getName(first, last);
			
			
			//Get the number of different items bought
			int items = scan.nextInt();
			
			//Total money this customer spends
			double total = 0;
			money[i] = "";
			
			//Calculate total money this customer spends
			for (int j = 0; j < items; j++) {
				//The amount of this item
				int amount = scan.nextInt();
				//Skip item name
				scan.next();
				//The individual price of this item
				double price = scan.nextDouble();
				//Add
				total = total + amount * price;				
			}
			//Add to array
			//Convert to correct format
			money[i] = money[i] + String.format("%.2f", total);
			//Print out results
			System.out.println(names[i] + ": " + money[i]);
		}
		
		//End scanner
		scan.close();
				
	}
	
	//Convert names to correct format
	public static String getName(String str1, String str2) {
		String str = str1.charAt(0) + ". " + str2;
		return str;
	}
		
}
