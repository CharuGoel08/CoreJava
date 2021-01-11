/*Write a function findPrime which will accept range of values from user and 
return int array from  function and print all numbers from it*/

package com.psl.eltp.training.StringManipAssignment;
import java.util.Scanner;

public class ArrayOfPrimes {

	
	static int[] findPrime(int start, int end)
	{
		int[] arr=new int[end/2];
		int k=0;
		for (int i = start; i < end; i++) {
			int c=0;
			for (int j = 2; j < i; j++) {
				if(i%j==0){
					c++; break;
				} 
			}if(c==0) arr[k++]=i;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting point");
		int start=sc.nextInt();
		System.out.println("Enter last point");
		int end=sc.nextInt();
		for (int e : findPrime(start, end)) {
			if(e==0) break;
			System.out.println(e);
		}
		
		
		sc.close();
	}

}

