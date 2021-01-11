/*Write a function find and replace 
 * which will replace the given string from the source string.*/

package com.psl.eltp.training.StringManipAssignment;
import java.util.Scanner;

public class ReplaceString {
	
	static String findAndReplace(String given,String old,String n)
	{
		String replaceString=given.replace(old,n);
		return replaceString;
	}
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String given = sc.nextLine();
	System.out.println("Given String '"+given+"'");
	System.out.print("replace ");
	String old=sc.nextLine();
	System.out.print("with ");
	String nw=sc.nextLine();
	System.out.println("Old String : "+given);
	given=findAndReplace(given, old, nw);
	System.out.println("New String : "+given);
	
	sc.close();
	}	
}