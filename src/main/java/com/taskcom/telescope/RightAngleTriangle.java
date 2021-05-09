package com.taskcom.telescope;

public class RightAngleTriangle {

	public static void main(String[] args) {
		int i,j,row=5;
		for(i=0;i<row;i++) {
			for(j=2*(row-i);j>1;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=i;k++) {
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}

	}

}
