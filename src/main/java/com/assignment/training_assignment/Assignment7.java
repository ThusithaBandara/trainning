package com.assignment.training_assignment;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment7 {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		String s1=scn.nextLine();
		LocalTime t = LocalTime.parse(
                s1, DateTimeFormatter.ofPattern("hh:mm:ssa"));
		System.out.println(t);
		
	
	}

}
