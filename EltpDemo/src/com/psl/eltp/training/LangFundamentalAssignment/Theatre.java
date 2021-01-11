/*An old-style movie theater has a simple profit program. Each customer pays $5 per ticket. 
 * Every performance costs the theater $20, plus $.50 per attendee. 
 * Develop the program that accepts the number of attendees (of a show) and 
 * calculates how much income the show earns.
static float calculateProfit( int numAttendees) */

package com.psl.eltp.training.LangFundamentalAssignment;
import java.util.Scanner;

public class Theatre {

	static float calculateProfit( int numAttendees)
	{
		float income=numAttendees*4.5f-20;
		return income;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of attendees");
		int count=sc.nextInt();
		System.out.println(calculateProfit(count));		
		sc.close();
	}

}


