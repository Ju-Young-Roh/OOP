package com.sd.convert;
import java.util.Scanner;

public class CFConvert {
		
	public static void main(String[] args) {
		String input;
		
		double input2, res;
		
		System.out.print("ȭ��, ������ �����ϼ���(F or C) ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		
		if(input.equals("F")){
			System.out.print("�µ��� �Է��ϼ��� ");
			input2 = scan.nextDouble();
			res = (input2-32)/1.8;
			System.out.println("���� "+ res +" �� �Դϴ�.");
		} else if(input.equals("C")){
			System.out.print("�µ��� �Է��ϼ��� ");
			input2 = scan.nextDouble();
			res = input2*1.8+32;
			System.out.println("ȭ�� "+ res +" �� �Դϴ�.");
		} else {
			System.out.println("INPUT ERROR!");
		}
	}
}