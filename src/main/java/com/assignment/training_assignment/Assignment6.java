package com.assignment.training_assignment;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Current version: ");
		String version=scn.nextLine();
		String[] s1=version.split(".");
		
		for(String a:s1) {
			System.out.println(a);
		}
		}
}
