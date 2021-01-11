/*Find the number of occurrences of given word in a sentence.
static int check(String sentence,String word)
*/

package com.psl.eltp.training.StringManipAssignment;
import java.util.Scanner;

public class FrequencyOfWords {
	
	static int check(String sentence,String word)
	{
		int c=0;
		String[] s=sentence.split(" ");
		for(int i=0;i<s.length;i++){
			if(s[i].equals(word)) c++;}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Sentence");
		String s=sc.nextLine();
		System.out.println("Enter word to find its occurences");
		String w=sc.next();
		System.out.println(check(s,w));
		
		sc.close();
	}

}
