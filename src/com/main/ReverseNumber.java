package com.main;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter number to reverse ");
			int a =sc.nextInt();
			
			int reverseNumber=0;
			
			while(a>0) {
				int rem=a%10;
				a/=10;
				reverseNumber=reverseNumber*10 +rem;
			}
			
			System.out.println("Reversed number is : " +reverseNumber);
		}

	}

}
