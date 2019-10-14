package com.assignment.training_assignment;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		Scanner emp=new Scanner(System.in);
		try {
			System.out.print("Number 1: ");
			int number1=scn.nextInt() ;
			System.out.print("Number 2: ");
			int number2=scn.nextInt();
			
			System.out.print("Operation: ");
			
			String operation=emp.nextLine();
			switch(operation) {
			case "+":System.out.println("Answer: "+(number1+number2));
			break;
			case "-":System.out.println("Answer: "+(number1-number2));
			break;
			case "*":System.out.println("Answer: "+(number1*number2));
			break;
			case "/":System.out.println("Answer: "+((double)number1/(double)number2));
			break;
			case "%":System.out.println("Answer: "+(number1%number2));
			break;
			default:System.out.println("Invalid Operation");
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	
	
//		System.out.println(number1+"	"+number2+"		"+operation);
	
	}

}
