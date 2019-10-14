package com.assignment.training_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Numbers ");
		String numbers=scn.nextLine();
		String num1[]=numbers.split(" ");
		ArrayList<Integer> ar=new ArrayList<Integer>();
	
		for(String a:num1) {
			ar.add(Integer.parseInt(a));
		}
		System.out.println(ar);
		System.out.println(Assignment3.minimum(ar));
		System.out.println(Assignment3.maximum(ar));
		System.out.println(Assignment3.average(ar));
		
	}
	
	public static int minimum(ArrayList<Integer> arr) {
		Iterator<Integer> arr2=arr.iterator();
		
		int minimum=arr2.next();
		while(arr2.hasNext()) {
			int asume=arr2.next();
			if(minimum>=asume) {
				minimum=asume;
			}
		}
		return minimum;
		
	}
	public static int maximum(ArrayList<Integer> arr) {
		Iterator<Integer> arr2=arr.iterator();
		
		int maximum=arr2.next();
		while(arr2.hasNext()) {
			int asume=arr2.next();
			if(maximum<=asume) {
				maximum=asume;
			}
		}
		return maximum;
		
	}
	public static double average(ArrayList<Integer> arr) {
		int total=0;
		int size=arr.size();
		Iterator<Integer> arr2=arr.iterator();
		while (arr2.hasNext()) {
			
			total=total+arr2.next();
			
		}
		try {
			double avg=(double)total/(double)size;
			return avg;
		} catch (Exception e) {
			System.out.println(e);
			return (Double) null;
		}
		
	}

}
