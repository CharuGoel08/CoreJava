/*Write a program that will reverse the sequence of letters in each word of a chosen paragraph . 
For instance, " To be or not to be " Would become " oT eb ro ton ot eb"
static String  makeReverse(String str)
*/

package com.psl.eltp.training.StringManipAssignment;
import java.util.Scanner;

public class ReverseWords {
	
	
	static String reverse(String word)//PURE LOGIC
	{

		String n=new String();
		for (int i = word.length()-1; i >= 0; i--) {
			n+=word.charAt(i);
		}
		return n;
	}
	
	static String  makeReverse(String str)
	{
		String[] s=str.split(" ");
		String f="";
		for (int i = 0; i < s.length; i++) 
		{
			f+=(reverse(s[i])+" ");
			//f+=(usingStringBuilder(s[i])+" ");//UNCOMMENT LINE TO USE STRINGBUILDER FUNCTION
		}
		return f;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence : ");
		String sentence=sc.nextLine();
		System.out.println("Original String      :"+sentence);
		System.out.println("Reversed Word String :"+makeReverse(sentence));
		sc.close();
	}
}