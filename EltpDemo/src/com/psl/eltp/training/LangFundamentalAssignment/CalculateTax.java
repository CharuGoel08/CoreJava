/*Develop the program, which accepts the gross pay and produces the amount of tax owed. 
 * For a gross pay of $240 or less, the tax is 0%; 
 * for over $240 and less than $480, the tax rate is 15%; 
 * and for any pay over $480, the tax rate is 28%.
static double calTax(int gp)*/


package com.psl.eltp.training.LangFundamentalAssignment;
import java.util.Scanner;

public class CalculateTax {

	static double calTax(int gp)
	{
		double amt=0;
		if(gp<=240);
		else if(gp>240&&gp<=480) amt+=(gp*15/100);
		else if(gp>480) amt+=(gp*28/100);
		return amt;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter gross pay");
		
		int gp=sc.nextInt();
		
		System.out.println("Tax amount is: "+calTax(gp));
		
		sc.close();
	}

}

