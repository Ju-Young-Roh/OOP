package com.sd.bmi;
import java.util.Scanner;

public class BMI {
		
	public static void main(String[] args) {
		double weight, height, bmi;
		String res = "";
		
		System.out.print("키(m)와 몸무게(kg)를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		height = scan.nextDouble();
		weight = scan.nextDouble();

		bmi = weight/ (height * height);

		if(bmi<18.5){
			res = "저체중";
		} else if(18.5<=bmi&&bmi<23){
			res = "정상체중";
		} else if(23<=bmi&&bmi<25){
			res = "위험";
		} else if(25<=bmi&&bmi<30){
			res = "경도비만";
		} else if(30<=bmi&&bmi<40){
			res = "중도비만";
		} else if(40<=bmi){
			res = "고도비만";
		} else {
			System.out.print("INPUT ERROR!");
		}
		
		System.out.println(res + " 입니다");
	}
}
