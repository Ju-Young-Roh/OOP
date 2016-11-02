package com.sd.rsp;
import java.util.Scanner;

public class RockScissorsPaper {
		
	public static void main(String[] args) {
		int input = 0;
		int com = (int)(Math.random()*3 + 1);		
		String sInput = "";
		System.out.println("가위, 바위, 보 중에 한가지를 선택하세요");

		Scanner scan = new Scanner(System.in);		
		sInput = scan.nextLine();
		
		if(sInput.equals("가위")){
			if(com==1){
				System.out.println("DRAW");
			} else if(com == 2){
				System.out.println("You Lose");
			} else if(com == 3){
				System.out.println("You Win");
			}
		} else if (sInput.equals("바위")){
			if(com==1){
				System.out.println("You Win");
			} else if(com == 2){
				System.out.println("DRAW");
			} else if(com == 3){
				System.out.println("You Lose");
			}
		} else if (sInput.equals("보")){
			if(com==1){
				System.out.println("You Lose");
			} else if(com == 2){
				System.out.println("You Win");
			} else if(com == 3){
				System.out.println("DRAW");
			}
		} else{
			System.out.println("INPUT ERROR");
		}
	
	}
}