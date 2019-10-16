package com.assignment.training_assignment;

import java.util.Scanner;

import org.apache.commons.lang.StringEscapeUtils;

public class Assignment10 {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Text with Unicode: ");
		String unicodeText=scn.nextLine();
		String text = StringEscapeUtils.unescapeJava(unicodeText);		
		System.out.println(StringEscapeUtils.unescapeJava(text));
	}

}
