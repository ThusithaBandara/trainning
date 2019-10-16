package com.assignment.training_assignment;

import java.util.Random;
import java.util.Scanner;

public class Assignment11 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("Number of digit for the random number: ");
		int randomNumber=scn.nextInt();
		String random="";
		while(randomNumber>0) {
			
			random=random+""+rand.nextInt(10);
			randomNumber--;
		}
		System.out.println(random);
	}

}
