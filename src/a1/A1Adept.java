package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//number of items in the store
		int num_s = scan.nextInt();
		
		String[] item_names = new String[num_s];
		double[] item_prices = new double[num_s];
		
		//Read store item info
		for (int i = 0; i < num_s; i++) {
			item_names[i] = scan.next();
			item_prices[i] = scan.nextDouble();
		}
		
		//Customer
		int num_c = scan.nextInt();
		
		//Store customer info
		String[] names = new String[num_c];
		double[] money = new double[num_c];
		
		for (int i = 0; i < num_c; i++) {
			names[i] = scan.next() + " " + scan.next();
			//number of items the customer buys
			int num_i = scan.nextInt();
			
			for (int j = 0; j < num_i; j++) {
				//amount
				int amount = scan.nextInt();
				//name of item
				String item = scan.next();
				//add to total money
				money[i] = money[i] + getMoney(item_names, item_prices, item, amount);
			}
			//System.out.println(money[i]);
		}
		
		int index_max = indexMax(money);
		int index_min = indexMin(money);
		double average = getAverage(money);
		
		System.out.println("Biggest: " + names[index_max] + " (" + String.format("%.2f",money[index_max]) + ")");
		System.out.println("Smallest: " + names[index_min] + " (" + String.format("%.2f", money[index_min]) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
	}
	
	//Precondition: the item the customers buy must be in store
	public static double getMoney(String[] strs, double[] dbs, String str, int i) {
		int index = 0;
		for (int a = 0; a < strs.length; a++) {
			index = a;
			if (str.equals(strs[a])) {
				break;
			}
		}
		return i * dbs[index];
	}
	
	//Precondition: only one max/min value
	public static int indexMax(double[] dbs) {
		int max = 0;
		for (int i = 1; i < dbs.length; i++) {
			if (dbs[i] > dbs[max]) {
				max = i;
			}
		}
		return max;
	}
	
	public static int indexMin(double[] dbs) {
		int min = 0;
		for (int i = 1; i < dbs.length; i++) {
			if (dbs[i] < dbs[min]) {
				min = i;
			}
		}
		return min;
	}
	
	public static double getAverage(double[] dbs) {
		double sum = 0;
		for (int i = 0; i < dbs.length; i++) {
			sum = sum + dbs[i];
		}
		return (sum / dbs.length);
	}
}
