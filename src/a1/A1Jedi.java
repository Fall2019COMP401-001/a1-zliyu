package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//number of items in the store
		int num_s = scan.nextInt();
				
		//Create list to store item names, number of customer who buy it, and the total number sold
		String[] item_names = new String[num_s];
		int[] item_c = new int[num_s];
		int[] item_num = new int[num_s];
		
		//Read stored item info
		for (int i = 0; i < num_s; i++) {
			item_names[i] = scan.next();	
			scan.nextDouble();
		}
		
		//Number of customer
		int num_c = scan.nextInt();
		
		//i: the #i customer
		//Loop i times
		//Precondition: each customer only appear once
		for (int i = 0; i < num_c; i++) {
			//Skip names
			scan.next();
			scan.next();
			
			//number of items the customer buys
			int num_i = scan.nextInt();
			
			//Loop through each item the customer buys
			for (int j = 0; j < num_i; j++) {
				int amount = scan.nextInt();
				int item_index = getIndex(scan.next(), item_names);
				item_c[item_index] ++;
				item_num[item_index] += amount;
			}
		}
		
		//Output results
		//Loop through all items
		for (int i = 0; i < num_s; i ++) {
			if (item_c[i] == 0) {
				System.out.println("No customers bought " + item_names[i]);
			}
			else {
				System.out.println(item_c[i] + " customers bought " + item_num[i] + " "+ item_names[i]);
			}
		}
		
		
		
		scan.close();
	}
	//Precondition: the item the customers buy must be in store
	public static int getIndex(String str, String[] strs) {
		int index = 0;
		//find the index of the item
		for (int a = 0; a < strs.length; a++) {
			index = a;
			if (str.equals(strs[a])) {
				break;
			}
		}
		return index;
	}
}
