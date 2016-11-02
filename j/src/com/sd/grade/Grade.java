package com.sd.grade;
import java.util.Scanner;

public class Grade {
		
	public static void main(String[] args) {
		char grade;
		double input;
		
		System.out.print("점수를 입력해주세요 ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextDouble();
		
		if(90<=input&&input<=100){
			grade = 'A';
			System.out.println(grade);
		} else if(80<=input&&input<90){
			grade = 'B';
			System.out.println(grade);
		} else if(70<=input&&input<80){
			grade = 'C';
			System.out.println(grade);
		} else if(60<=input&&input<70){
			grade = 'D';
			System.out.println(grade);
		} else if(input<60){
			grade = 'F';
			System.out.println(grade);
		} else {
			System.out.print("INPUT ERROR!");
		}
	}
}
