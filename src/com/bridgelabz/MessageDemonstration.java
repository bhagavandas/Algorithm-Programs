package com.bridgelabz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDemonstration {
	public static void main(String[] args) {

		Date obj = new Date();
		Scanner input = new Scanner(System.in);
		System.out.print("Hello ");
		System.out.println("Enter your name");
		String name = input.next();
		System.out.println("We have your full name as  ");
		
		String fullName = input.next();
		System.out.println("in our system.");
		System.out.print("Your contact number is  ");
		
		String number = input.next();
		if (isValidMobileNo(number))
			System.out.println(number);
		else
			System.out.println("Entered mobile number is invalid.");

		System.out.println("Please,let us know in case of any clarification Thank you BridgeLabz ");

		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);

		System.out.println("Modified Message :" + "Hello " + name + " , " + "We have your full name as " + fullName
				+ " in our system." +"Your contact number is  "+ number +" Please,let us know in case of any clarification Thank you BridgeLabz "+ date);

	}

	public static boolean isValidMobileNo(String str) {

		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher match = ptrn.matcher(str);
		return (match.find() && match.group().equals(str));
	}

}
