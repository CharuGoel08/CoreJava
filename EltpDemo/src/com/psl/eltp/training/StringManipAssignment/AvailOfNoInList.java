/*3.	Write a program to find the availability of given number in the list. 
static int findPosition(int num,int[] nos)
*/

package com.psl.eltp.training.StringManipAssignment;
import java.util.*;

public class AvailOfNoInList {

	static int findPosition(int num, List<Integer> nos)
	{
		if(nos.contains(num))
			return nos.indexOf(num);
		else 
            return 0;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<100;i+=5) list.add(i);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find in array");
		int n=sc.nextInt();
		int res = findPosition(n,list);
		if(res==0)
			System.out.println("no not found");
		else
			System.out.println(res);
		sc.close();
	}

}
