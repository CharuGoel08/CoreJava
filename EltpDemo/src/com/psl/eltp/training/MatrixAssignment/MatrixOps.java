package com.psl.eltp.training.MatrixAssignment;

public class MatrixOps {
	
	static int[][] add(int[][] m1, int[][] m2) {
		int m = m1.length;
		int n = m1[0].length;
		int res[][] = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				res[i][j] += m1[i][j] + m2[i][j];
			}
		}
		return res;
	}
	
	static int[][] multiply(int[][] m1, int[][] m2) {
		int m = m1.length;
		int n = m2[0].length;
		int res[][] = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
				res[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return res;
	}
	
	static int[][] transpose(int[][] m1) {
		int m = m1.length;
		int n = m1[0].length;
		int res[][] = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				res[i][j] += m1[j][i];
			}
		}
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int m2[][] = {{10,11,12},{13,14,15},{16,17,18}};
		
		
		
		System.out.println("Addition");
		int addResult[][] = MatrixOps.add(m1,m2);
		for(int i=0;i<addResult.length;i++) {
			for(int j=0;j<addResult[0].length;j++) {
				System.out.print(addResult[i][j] +" ");
			}
			System.out.println("");
		}
		
		System.out.println("Multiplication");
		int multiplyResult[][] = MatrixOps.multiply(m1,m2);
		for(int i=0;i<multiplyResult.length;i++) {
			for(int j=0;j<multiplyResult[0].length;j++) {
				System.out.print(multiplyResult[i][j] +" ");
			}
			System.out.println("");
		}
		
		System.out.println("Transpose");
		
		int transposeResult[][] = MatrixOps.transpose(m1);
		for(int i=0;i<transposeResult.length;i++) {
			for(int j=0;j<transposeResult[0].length;j++) {
				System.out.print(transposeResult[i][j] +" ");
			}
			System.out.println("");
		}

	}

}