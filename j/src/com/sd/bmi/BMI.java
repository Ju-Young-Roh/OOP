package com.sd.bmi;
import java.util.Scanner;

public class BMI {
		
	public static void main(String[] args) {
		double weight, height, bmi;
		String res = "";
		
		System.out.print("Ű(m)�� ������(kg)�� �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		height = scan.nextDouble();
		weight = scan.nextDouble();

		bmi = weight/ (height * height);

		if(bmi<18.5){
			res = "��ü��";
		} else if(18.5<=bmi&&bmi<23){
			res = "����ü��";
		} else if(23<=bmi&&bmi<25){
			res = "����";
		} else if(25<=bmi&&bmi<30){
			res = "�浵��";
		} else if(30<=bmi&&bmi<40){
			res = "�ߵ���";
		} else if(40<=bmi){
			res = "����";
		} else {
			System.out.print("INPUT ERROR!");
		}
		
		System.out.println(res + " �Դϴ�");
	}
}
