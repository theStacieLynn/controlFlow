package com.ruiz.controlflow;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		
		calculateGrade();
		demoSwitch();
		calculateTax();
		/*1.Write a program that declares 1 integer variable x, and then assigns 7 to it.
		Write an if statement to print out “Less than 10” if x is less than 10. Change x to
		equal 15, and notice the result (console should not display anything).*/
		
//		int x = 7;
//		if(x<10) {
//			System.out.println("Less than 10");
//		}
		
		/*2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
		Write an if-else statement that prints out “Less than 10” if x is less than 10, and
		“Greater than 10” if x is greater than 10. Change x to 15 and notice the result.*/
		int x =15;
		if(x<10) {
			System.out.println("Less than 10");
		}else {
			System.out.println(" x is greater than 10");
		}
		System.out.println();
		
/*3. Write a program that declares 1 integer variable x, and then assigns 15 to it.
Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
“Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than
or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the
result.*/
		int y = 15;
		if(y<10) {
			System.out.println(" Y is Less than 10");
		}
		else if(y>10 & y<20) {
			System.out.println("Y is between 10 and 20");
		}else {
			System.out.println("Y is greater than 20");
		}
		System.out.println();
/*4. Write a program that declares 1 integer variable x, and then assigns 15 to it.
Write an if-else statement that prints “Out of range” if the number is less than 10
or greater than 20 and prints “In range” if the number is between 10 and 20
(including equal to 10 or 20). Change x to 5 and notice the result.*/
		int n1 = 15;
		if(n1<10 |n1>20) {
			System.out.println("Out of range");
		}else if(n1>=10 & n1<=20) {
			System.out.println("In range");
		}
		System.out.println();



	}
	/*5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F
	according to the following criteria:
	A: 90-100
	B: 80-89
	C: 70-79
	D: 60-69
	F: <60 
			 
	Use the Scanner class to accept a number score from the user to determine the
	letter grade. Print out “Score out of range” if the score is less than 0 or greater
	than 100.*/
	public static void calculateGrade() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter grade: ");
		int grade = scan.nextInt();
		if(grade>100) {
			System.out.println("Out of range");
		}else if(grade>=90) {
			System.out.println("A");
		}else if(grade>=80) {
			System.out.println("B");
		}else if(grade>=70) {
			System.out.println("C");
		}else if(grade>=60) {
			System.out.println("D");
		}else if(grade<60 & grade>=0) {
			System.out.println("F");
		}else if(grade<0) {
			System.out.println("Score out of range");
		}
		System.out.println();
	}
	/*6. Write a program that accepts an integer between 1 and 7 from the user. Use
	a switch statement to print out the corresponding weekday. Print “Out of range”
	if the number is less than 1 or greater than 7. Do not forget to include “break”
	statements in each of your cases.*/
	public static void demoSwitch() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number betweeb 1 and 7");
		int day = scan.nextInt();
		switch(day) {
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		default:
			System.out.println("Out of range");
		
		}
		System.out.println();
	}
	/*7. Create a program that lets the users input their filing status and income.
	Display how much tax the user would have to pay according to status and
	income. */
	public static void calculateTax() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter filing status: ");
		String status = scan.nextLine();//can try ignore case
		System.out.println("Enter income: ");
		double income = scan.nextDouble();
		double tax = 0;
		if(status == "Single") {
			if(income<=8350) {
				tax = income*.10;
			}else if(income<=33950) {
				tax = income*.15;
			}else if(income<=82250) {
				tax = income*.25;
			}else if(income<=171550) {
				tax = income*.28;
			}else if(income<=372950) {
				tax = income*.33;
			}else {
				tax = income*.35;
			}
		}
		if(status == "Maried Filing Jointly") {
			if(income<=16700) {
				tax = income*.10;
			}else if(income<=67900) {
				tax = income*.15;
			}else if(income<=137050) {
				tax = income*.25;
			}else if(income<=208850) {
				tax = income*.28;
			}else if(income<=372950) {
				tax = income*.33;
			}else {
				tax = income*.35;
			}
		}
		if(status == "Maried Filing Seperately") {
			if(income<=8350) {
				tax = income*.10;
			}else if(income<=33950) {
				tax = income*.15;
			}else if(income<=68525) {
				tax = income*.25;
			}else if(income<=104425) {
				tax = income*.28;
			}else if(income<=186475) {
				tax = income*.33;
			}else {
				tax = income*.35;
			}
		}
		if(status == "Head of Household") {
			if(income<=11950) {
				tax = income*.10;
			}else if(income<=45500) {
				tax = income*.15;
			}else if(income<=117450) {
				tax = income*.25;
			}else if(income<=190200) {
				tax = income*.28;
			}else if(income<=372950) {
				tax = income*.33;
			}else {
				tax = income*.35;
			}
		}
		System.out.println();
	}
}
