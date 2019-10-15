package com.assignment.training_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Current version: ");
		String version=scn.nextLine();
		
		String[] s1=version.split("\\.");
		System.out.print("Type of change (i for minor,j for major, n for non-backward compatible): ");
		String s2=scn.nextLine();
		switch (s2) {
		case "i":
			int i=Integer.parseInt(s1[2])+1;
			System.out.println(s1[0]+"."+s1[1]+"."+i);
			break;
		case "j":
			int j=Integer.parseInt(s1[1])+1;
			System.out.println(s1[0]+"."+j+"."+0);
			
			break;
		case "n":
			int n=Integer.parseInt(s1[0])+1;
			System.out.println(n+"."+0+"."+0);
			break;

		default:
			System.out.println("Invalid");
			break;
		}
		
	
		}
}
