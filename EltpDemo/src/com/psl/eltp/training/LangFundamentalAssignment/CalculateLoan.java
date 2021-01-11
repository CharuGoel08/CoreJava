/*Some credit card companies pay back a small portion of the charges a customer makes over a year. 
 * A particular credit card company's pay back policy is as follows:
1.0.25% for charges up to Rs. 500.
2.0.50% for the next Rs.1000 (that is, the portion between Rs. 500 and Rs. 1500),
3.0.75% for the next Rs.1000 (that is, the portion between Rs. 1500 and Rs. 2500),
4.1.0% for charges above Rs2500.
Thus, a customer who charges Rs. 400 a year receives Rs.1.00,
which is 0.25 x 1/100 x 400, and 
one who charges Rs1400 a year receives Rs. 5.75,
 which is 1.25 = 0.25 x 1/100 x 500 for the first Rs. 500 and 0.50 x 1/100 x 900 = 4.50 for the next Rs. 900. 
 Determine by hand the pay backs amount for a customer who charged Rs. 2000 and one who charged Rs. 2600.
Define the program, which accepts a charge amount and computes the corresponding pay back amount.
static float calLoan(int age,char gender,String job,int asset)
*/

package com.psl.eltp.training.LangFundamentalAssignment;
import java.util.Scanner;

public class CalculateLoan {
	static float calLoan(int age,char gender,String job,int asset)
	{

		int a=asset;
		float pb=0;
		int lim=500;
		float r=0;
		System.out.println("Age = "+age+"\nGender = "+gender+"\nJob = "+job+"\nAsset = "+asset);
		while(a>0||r==1)
		{
			r+=0.25f;
			if(a>=lim){
				a-=lim;	
				pb+=r*lim/100;
				lim=1000;
				}
			else{
				pb+=r*a/100;
				return pb;
				}	
		} return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter Gender m/f?");
		char g=sc.next().charAt(0);
		System.out.println("Enter job");
		String job=sc.next();
		System.out.println("Enter asset");
		int asset=sc.nextInt();
		
		System.out.println("Pay Back = "+calLoan(age,g,job,asset));
		
		sc.close();
	}
	
}
