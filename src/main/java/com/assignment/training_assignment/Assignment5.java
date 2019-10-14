package com.assignment.training_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String args[]) {
		
		Scanner scn=new Scanner(System.in);
		String input=scn.nextLine();
		Assignment5.isUpperCase(input);
		System.out.println();
	}
	
	public static void isUpperCase(String a) {
		char[] ar2=a.toCharArray();
		int len=a.length();
		System.out.print(Character.toUpperCase(ar2[0]));
		for(int i=1;i<len;i++) {
			if(Character.isUpperCase(ar2[i])) {
				System.out.print(" "+ar2[i]);
			}else {
				System.out.print(ar2[i]);
			}
		}
	}

}
