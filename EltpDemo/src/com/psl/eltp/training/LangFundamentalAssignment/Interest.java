/*Develop a program, that accepts a deposit amount and calculates amount of interest 
 * the deposit amount earns in a year. The bank pays a flat 4% interest for deposits
 *  of up to Rs.1000, a flat 4.5% per year for deposits of up to Rs.5000, 
 *  and a flat 5% for deposits of more than Rs.5000.
static double calInterest(int amt) */

package com.psl.eltp.training.LangFundamentalAssignment;
import java.util.Scanner;

public class Interest {

	static double calInterest(int amt)
	{
		float r;
		if(amt<=1000)
			r=4f;
		else if(amt>5000)
			r=5f;
		else 
			r=4.5f;
		
		double intr=(amt*r)/100;
		return intr;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		Double d = calInterest(amount);
		System.out.println(d);
		sc.close();
	}

}
