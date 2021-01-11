/*Ezee Shop has an online portal where customers can check about different products. 
Customers can search for products by giving a key word.
Write a program that accepts a product name and a key word, 
and checks if the key word is present in the given product name.

static String[] initProductNames()
static boolean isPresent(String[] productNames, String keyword)
*/

package com.psl.eltp.training.StringManipAssignment;
import java.util.*;

public class SearchProduct {
	
	static Scanner scan = new Scanner(System.in);

	static String[] initProductNames(){
		System.out.println("enter no of products");
		int n=scan.nextInt();
		System.out.println("enter product names");
		String prod[] = new String[n];
		for(int i=0;i<n;i++)
			prod[i] = scan.next();
		return prod;
	}
	
	
	static boolean isPresent(String[] productNames, String keyword)
	{
	Boolean f = false;
	for(int i=0;i<productNames.length;i++){
		if(productNames[i].contains(keyword)){
			f=true;
			break;
		}
			
	}
	return f;
	}
	
	public static void main(String[] args) 
	{
		 String kyword;
		 
		 String[] pname = initProductNames();
		 
		 System.out.println("enter key word");
		 kyword = scan.next();
		 
		 Boolean ans = isPresent(pname,kyword);
		 System.out.println(ans);
		
		 
	}

}

