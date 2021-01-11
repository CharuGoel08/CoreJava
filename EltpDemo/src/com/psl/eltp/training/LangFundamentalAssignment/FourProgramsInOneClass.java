/*1.	Find the maximum of three numbers 
static int calMax(int x,int y,int z)
2.	Write a program to check whether the input alphabet is a vowel or not.
static boolean checkAlpha(char alph)
3.	Find the number is prime or not.
static boolean isPrimeNumber( int num)
4.	Method will accept range value and print all prime numbers from 2 to range on console.
   void printPrime(int maxVal)
*/

package com.psl.eltp.training.LangFundamentalAssignment;
import java.util.Scanner;

public class FourProgramsInOneClass {

	static int calMax(int x, int y, int z)
	{
		if(x>y&&x>z) return x;
		else if (y>x&&y>z) return y;
		else return z;
	}
	
	static boolean checkAlpha(char alph)
	{
		boolean flag=true;
		switch(alph){
		case 'a': case 'e': case 'i': case 'o':case 'u':
		case 'A': case 'E': case 'I': case 'O': case 'U':	
			break;
		default:flag=false;
		}
		return flag;
	}
	
	static boolean isPrimeNumber(int num)
	{
		boolean flag=true;
		for (int i=2; i<num; i++) {
			if(num%i==0){
			flag=false;
			break;
			}
		}
		return flag;
	}
	
	void printPrime(int maxVal){
		for (int i=1; i<=maxVal; i++) {
			int c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				c++;
				break;
				}
			}
			if(c==0)System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int v;
		do{
			System.out.println("Choose one\n1.Check Greater Number \n2.Check Vowel \n3.Is Prime Number \n4.Print Prime \n5.Exit");
			v=sc.nextInt();
			switch (v) {
			case 1:
				int x,y,z;
				System.out.println("Enter three numbers");
				x=sc.nextInt();
				y=sc.nextInt();
				z=sc.nextInt();
				System.out.println(calMax(x,y,z));
				break;
				
			case 2:
				System.out.println("Enter a Character");
				char a=sc.next().charAt(0);
				if(checkAlpha(a)) System.out.println("Vowel");
				else System.out.println("Consonant");
				break;
			
			case 3:
				System.out.println("Enter number");
				int b=sc.nextInt();
				if(isPrimeNumber(b)) System.out.println("Prime");
				else System.out.println("Not Prime");
				break;
				
			case 4:
				System.out.println("enter range");
				int c=sc.nextInt();
				FourProgramsInOneClass fp =new FourProgramsInOneClass();
				fp.printPrime(c);
				break;
			case 5:
				System.out.println("Program Ended");
				System.exit(0);
			
			default:
				System.out.println("Wrong Choice: Try Again");
				break;
			}
		}while(v!=5);
		
		sc.close();
	}

}



