package com.sd.reversetriangle;
public class ReverseTriangle {
		
	public static void main(String[] args) {
		int row = 10;
		
		for (int i=0; i<row; i++) {
            for (int j=i; j<row-1; j++)
                System.out.print(" ");
            for (int k=0; k<=i; k++)
                System.out.print("*");
            System.out.println("");
        }
	}
}