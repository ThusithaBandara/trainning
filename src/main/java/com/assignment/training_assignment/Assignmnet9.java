package com.assignment.training_assignment;

import java.util.Scanner;

public class Assignmnet9 {

	
		   public static void main(String[] args) throws Exception {
				
			   Scanner scn=new Scanner(System.in);
			   System.out.print("Unicode: ");
			   String unicode=scn.nextLine();
			   int unicodeValue=Integer.parseInt(unicode);
			   char character=(char) unicodeValue;
					System.out.print("Character: "+character);
				
		   }
		
}
