/*
 * 10.	Write a program to create a rectangular array containing a multiplication table from 1*1 up to 12*12. 
 * Output the table as 13 columns with the numeric values right-aligned in columns. 
 * (The first line of output will be the column headings, the first column with no heading, then the numbers 1 to 12 for 
 * the remaining columns. The first item in each of the succeeding lines is the row heading, which ranges from 1 to 12.)
 */

package com.psl.eltp.training.LangFundamentalAssignment;

public class MultiplicationTable {
	
	static void displayMultiplicationMatrix(){
		int[][] table= new int[12][12];
		//creating the main multiplication table
		for(int i=0;i<table.length;i++){
			for(int j=0;j<table.length;j++)
				table[i][j]=(i+1)*(j+1);
		}
		
		//inserting the heading line
		System.out.print("      :");//the first column with no heading
		for(int i=1;i<=table.length;i++)//then the numbers 1 to 12 for the remaining columns
			System.out.print((i<10?"   ":"  ")+i);
		System.out.println();
		
		for(int i=0;i<table.length;i++)
		{
			//The first item in each of the succeeding lines is the row heading
			System.out.print("Row"+(i<9?"  ":" ")+(i+1)+":");
			for(int j=0;j<table.length;j++){
				//spacing to show clear output
				System.out.print((table[i][j]<10?"   ":table[i][j]<100?"  ":" ")+table[i][j]);
			}System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		displayMultiplicationMatrix();
	}

}
