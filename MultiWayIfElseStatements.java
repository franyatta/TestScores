//this program tells you your grade depending on your test score

import java.util.Scanner;

public class MultiWayIfElseStatements {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the test score: ");
	int score = input.nextInt();
	
	if (score >= 90) 
		System.out.print("Your grade is A");
	else if (score >= 80)
		System.out.print("Your grade is B");
	else if (score >= 70)
		System.out.print("Your grade is C");
	else if (score >= 60)
		System.out.print("Your grade is D");
	else if (score >= 0)
		System.out.print("Your grade is F");
	else
		System.out.print("Invalid Score");
	
	input.close();
	// if its only one statement you don't have to use curly brackets
	// when one control statement is within another, its called a nested statement
	}

}
//franyatta