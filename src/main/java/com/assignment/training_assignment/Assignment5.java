package com.assignment.training_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String args[]) {
		
		Scanner scn=new Scanner(System.in);
		String input=scn.nextLine();
		char[] arr=input.toCharArray();
		Assignment5.isUpperCase(arr);
		System.out.println();
	}
	
	public static void isUpperCase(char[] a) {
		int len=a.length;
		ArrayList<Integer[]> upp=new ArrayList<Integer[]>();
		int count =0;
		int back=0;
		for(int i=0;i<len;i++) {
			if(Character.isUpperCase(a[i])&&count==0) {
				Integer[] a1= {0,i-1};
				upp.add(a1);
				back=i-1;
				count=count+1;
			}
			else if(Character.isUpperCase(a[i])) {
				Integer[] a1= {back+1,i-1};
				upp.add(a1);
				back=i-1;
			}
		
			
		}
		Integer[] a1= {back+1,len-1};
		upp.add(a1);
		System.out.println(upp.get(0)[0]);
		System.out.println(upp.get(0)[1]);
//		System.out.println(a.getClass());
		System.out.println(upp.get(1)[0]);
		System.out.println(upp.get(1)[1]);
		
	}

}
