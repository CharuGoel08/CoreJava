/*Electricity board wants to develop program to calculate Electricity Bill. 
They have two types of connections domestic and commercial, 
charges for domestic bill are as follows 
if consumed units are less or equals 100 then Rs.4/units or Rs. 250 whichever is greater
if consumed units are between 100 to 300 then Rs.4.50/units
if more than 300 and less than 500 Rs.4.75/units and above 500 Rs.5/units
For commercial connections charges are calculated as follows 
Consumed units are less or equals 100 then Rs.4.25/units or Rs. 350 whichever is greater.
if consumed units are between 100 to 300 then Rs.4.75/units.
if more than 300 and less than 500 Rs.5/units and above 500 Rs.5.25/units 
calculate electricity bill.
 */

package com.psl.eltp.training.LangFundamentalAssignment;
import java.util.Scanner;

public class ElectricityBill {

	
	static double domestic(int unit)
	{

		double bill=0;
		if(unit<=100)
		{
			double c=unit*4;
			bill=(c > 250)?c:250;
		}
		else if(unit>100&&unit<=300) bill=unit*4.5;
		else if(unit>300&&unit<=500) bill=unit*4.75;
		else bill=unit*5;
		return bill;
	}
	
	static double commercial(int unit)
	{
		double bill=0;
		if(unit<=100)
		{
			double c=unit*4.25;
			bill=(c>350)?c:350;
		}
		else if(unit>100&&unit<=300) bill=unit*4.75;
		else if(unit>300&&unit<=500) bill=unit*5;
		else bill=unit*5.25;
		return bill;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Units");
		int unit=sc.nextInt();
		System.out.println("Choose Bill Type\n1.Domestic\n2.Commercial");
		int t=sc.nextInt();
		switch (t) {
		case 1:
			System.out.println("Electricity bill is : "+domestic(unit));
			break;
		case 2:
			System.out.println("Electricity bill is : "+commercial(unit));
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}
		
		sc.close();
	}


}

