package com.psl.eltp.training.StringManipAssignment;
import java.util.*;

public class CombinationOfStrings {
	
	    // Characters at position 
	    // a string value 
	    // i position 1 
	    // j position 2 
	    // return swapped string 
	    
	    public static String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i] ; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    }
	    
	  //static String[]  getCombinations(String str,int l,int r) 
		static void getCombinations(String str,int l,int r)
	    { 
			/*String[] arr = new String[100];
			int k=0;
	        if (l == r) {
	        	arr[k]=str;
	        	k++;
	        }*/
			if(l==r)
				System.out.println(str);
	            
	        else
	        { 
	            for (int i = l; i <= r; i++) 
	            { 
	                str = swap(str,l,i); 
	                getCombinations(str, l+1, r); 
	                str = swap(str,l,i); 
	            } 
	        }
	        //return arr;
	    } 
	
	public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter a string");
        String str = scan.next();
       
		int r=str.length();
		
     //   String[] arr = getCombinations(str,0,r-1); 
		getCombinations(str,0,r-1);
        
     //   for(String s:arr)
     //   	System.out.println(s);
        
        scan.close();
    } 
 
    
 
}

