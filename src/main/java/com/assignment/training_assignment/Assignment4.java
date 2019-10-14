package com.assignment.training_assignment;


import java.util.Scanner;

public class Assignment4 {
	public static void main(String args[]) {
		
		Scanner scn=new Scanner(System.in);
		String number=scn.nextLine();
		scn.close();
		System.out.println(Assignment4.getLuckyNumber(number));
		
		
	}
	public static int getLuckyNumber(String s) {
		int length=s.length();
		if(length==1) {
			return Integer.parseInt(s);
		}
		else {

			int total=0;
			for(int i=0;i<length;i++) {
				char num=s.charAt(i);
				total=total+Character.getNumericValue(num);	
			}
			
			if(total<10) {
				return total;
			}
			else {
				return getLuckyNumber(Integer.toString(total));
			}
		}
		
	}
	

}
