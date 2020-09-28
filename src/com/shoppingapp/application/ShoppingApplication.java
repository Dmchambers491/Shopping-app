package com.shoppingapp.application;

import java.util.Scanner;
import com.dollarsbank.utility.ColorsUtility.Colors;
import java.util.InputMismatchException;

public class ShoppingApplication {
	
	public static void welcome() {
		int choice = 0;
		Scanner input = new Scanner(System.in);
		boolean valid = true;
		
		while(valid) {
			System.out.println(Colors.ANSI_BLUE.getColor() + "Standalone Ecommerce App");
			System.out.println(Colors.ANSI_PURPLE.getColor() + "+=======================+");
			System.out.println(Colors.ANSI_PURPLE.getColor() + "|" + Colors.ANSI_CYAN.getColor() + "1.REGISTER\t\t" + Colors.ANSI_PURPLE.getColor() + "|");
			System.out.println(Colors.ANSI_PURPLE.getColor() + "|" + Colors.ANSI_CYAN.getColor() + "2.LOGIN\t\t" + Colors.ANSI_PURPLE.getColor() + "|");
			System.out.println(Colors.ANSI_PURPLE.getColor() + "|" + Colors.ANSI_CYAN.getColor() + "3.BUY AN ITEM\t\t" + Colors.ANSI_PURPLE.getColor() + "|");
			System.out.println(Colors.ANSI_PURPLE.getColor() + "|" + Colors.ANSI_CYAN.getColor() + "4.REPLACE AN ITEM\t" + Colors.ANSI_PURPLE.getColor() + "|");
			System.out.println(Colors.ANSI_PURPLE.getColor() + "|" + Colors.ANSI_CYAN.getColor() + "5.EXIT\t\t\t" + Colors.ANSI_PURPLE.getColor() + "|");
			System.out.println(Colors.ANSI_PURPLE.getColor() + "+=======================+");
			System.out.println(Colors.ANSI_GREEN.getColor() + "\nEnter Choice (1,2,3,4, or 5) :" + Colors.ANSI_RESET.getColor());
			
			try{
				choice = input.nextInt();
				switch(choice) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					default:
						break;
				}
			}catch(InputMismatchException e) {
				input.nextLine();
				System.out.println(Colors.ANSI_RED.getColor() + "Please enter a number!\n");
			}
		}
	}

	public static void main(String[] args) {
		welcome();
	}
}
