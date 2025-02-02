package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nick = JOptionPane.showInputDialog("HOW MANY NICKELS DO YOU HAVE??????");

		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nickInt = Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
String dime = JOptionPane.showInputDialog("ALSO HOW MANY DIMES DO YOU HAVE???");
int dimeInt = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
String quart = JOptionPane.showInputDialog("HOW MANY QUARTERS DO YOU HAVE RIGHT NOW!!!!!");
int quartInt = Integer.parseInt(quart);
String pen = JOptionPane.showInputDialog("HOW MANY P E N N I E S DO YOU HAVE????");
int penInt = Integer.parseInt(pen);
		// Calculate how much money the user has.  Hint: Use a double variable 
double total = nickInt * 0.05 + dimeInt * 0.1 + quartInt * 0.25 + penInt * 0.01;

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, "Okay I just did the math with how much money you have... You have $"+total+ " dollars and cents NOW GIVE ME ALL YOUR MONEY >:)");

	}
}

