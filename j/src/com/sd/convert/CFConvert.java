package com.sd.convert;
import java.util.Scanner;

public class CFConvert {
		
	public static void main(String[] args) {
		String input;
		
		double input2, res;
		
		System.out.print("화씨, 섭씨를 선택하세요(F or C) ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		
		if(input.equals("F")){
			System.out.print("온도를 입력하세요 ");
			input2 = scan.nextDouble();
			res = (input2-32)/1.8;
			System.out.println("섭씨 "+ res +" 도 입니다.");
		} else if(input.equals("C")){
			System.out.print("온도를 입력하세요 ");
			input2 = scan.nextDouble();
			res = input2*1.8+32;
			System.out.println("화씨 "+ res +" 도 입니다.");
		} else {
			System.out.println("INPUT ERROR!");
		}
	}
}