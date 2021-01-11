package com.psl.eltp.training.StringManipAssignment;
import java.util.*;

public class TicTacToe {
	
	static char findRes(char[][] tic){
		//checking diagnol
				char ch1 = tic[0][0];
				int c=0;
				
				for(int i=0;i<3;i++){
					for(int j=0;j<3;j++){
						if(i==j){
							if(tic[i][j]==ch1)
								c++;
						}
					}
				}
				if(c==3){
					return(ch1);
				}
				
				//checking rows
				for(int i=0;i<3;i++){
					char ch2 = tic[i][0];
					c=0;
					for(int j=0;j<3;j++){
						if(tic[i][j]==ch2){
							c++;
						}
					}
					if(c==3){
						return(ch2);
					}
				}
				
				//checking columns
				for(int j=0;j<3;j++){
					char ch2 = tic[j][0];
					c=0;
					for(int i=0;i<3;i++){
						if(tic[i][j]==ch2){
							c++;
						}	
					}
					if(c==3){
						return(ch2);
					}
				}
			return 'n';
	}
	
	public static void main(String args[]){
		
		char[][] tic = new char[3][3];
		char ch;
		Scanner scan = new Scanner(System.in);
		
		//taking input
		System.out.println("enter only o or x character");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				ch = scan.next().charAt(0);
				tic[i][j] = ch;
			}
		}
		
		scan.close();
		
		System.out.println(findRes(tic));
	}
}