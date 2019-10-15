package com.assignment.training_assignment;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment8 {

	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		
		System.out.print("Previous does time: ");
		String time=scn.nextLine();
		LocalTime t1=LocalTime.parse(time, DateTimeFormatter.ofPattern("h:mm a"));
		System.out.print("Time duration between doses: ");
		String duration=scn.nextLine();
		LocalTime t2=LocalTime.parse(duration, DateTimeFormatter.ofPattern("h:mm"));
		
	}
}
