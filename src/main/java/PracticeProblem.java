/**
	* File: Lesson 1.7 - Booleans (and, or, not)
	* Author: Leo
	* Date Created: Feb 23, 2026
	* Date Last Modified: Feb 24, 2026
	*/
import java.util.Scanner;	
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		boolean bool1 = true; 
		boolean bool2 = false;
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a lowercase letter: ");
		String letter1 = input.nextLine();
		System.out.print("Input another lowercase letter: ");
		String letter2 = input.nextLine();
		System.out.println(letter1.compareTo(letter2) < 0);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		System.out.println(num <= 10 && num >= 0);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		System.out.println(num > 0 && num != 5);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		System.out.println(word.compareTo("banana") != 0);
	}

	public static void q6() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		System.out.print("The integer " + num + " is ");
		System.out.println((num % 2) == 0);
	}

}
