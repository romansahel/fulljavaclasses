package class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.println("What do you want to buy?");
	        String item = input.nextLine();

	        System.out.println("What is the price of the item?");
	        double price = input.nextDouble();

	        double money;
	        double total = 0;
	        System.out.println("Please pay for your " + item);

	        do {

	            money = input.nextDouble();

	            total += money; // accumulate all money
	            double need;
	            double change;

	            if (total < price) {
	                need = price - total;
	                System.out.println("You need to pay more $" + need);
	            } else if (total >= price) {
	                change = total - price;
	                System.out.println("Here is your change " + change);
	                break;
	            }

	        } while (total != price);

	        System.out.println("Thank you for shopping");
		
		

	}

}
