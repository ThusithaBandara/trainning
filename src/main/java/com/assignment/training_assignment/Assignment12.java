package com.assignment.training_assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Assignment12 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Input: ");
		String input=scn.nextLine();
		
		int length=input.length();
		
		ArrayList<Integer> isAlpha=new ArrayList<Integer>();
		ArrayList<Integer> isNum=new ArrayList<Integer>();
		ArrayList<Integer> isNonAlpha=new ArrayList<Integer>();
		for(int i=0;i<length;i++) {
			if(Character.isLetter(input.charAt(i))) {
				isAlpha.add((int)input.charAt(i));
			}else if(Character.isDigit(input.charAt(i))) {
				isNum.add((int)input.charAt(i));
			}
			else {
				isNonAlpha.add((int)input.charAt(i));
			}
		}
		Collections.sort(isAlpha);
		Collections.sort(isNum);
		Collections.sort(isNonAlpha);
		
		isAlpha.forEach((n)->System.out.print((char)(int)n));
		isNum.forEach((n)->System.out.print((char)(int)n));
		isNonAlpha.forEach((n)->System.out.print((char)(int)n));
		
		
		
	}

}
