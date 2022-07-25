/**
 * 
 */
package com.quest1;

import java.util.Scanner;

import com.quest1.brackets.BalBrackets;

/**
 * @author bharat_2
 *
 */
public class BBracketsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BalBrackets balBrackets = new BalBrackets();
		System.out.println("Enter Bracket combination ");
		Scanner myScan = new Scanner(System.in);
		balBrackets.setStrbrackets(myScan.next());
		if (balBrackets.CheckBalanced()) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

}
