package com.sd.rsp;
import java.util.Scanner;

public class RockScissorsPaper {
		
	public static void main(String[] args) {
		int input = 0;
		int com = (int)(Math.random()*3 + 1);		
		String sInput = "";
		System.out.println("����, ����, �� �߿� �Ѱ����� �����ϼ���");

		Scanner scan = new Scanner(System.in);		
		sInput = scan.nextLine();
		
		if(sInput.equals("����")){
			if(com==1){
				System.out.println("DRAW");
			} else if(com == 2){
				System.out.println("You Lose");
			} else if(com == 3){
				System.out.println("You Win");
			}
		} else if (sInput.equals("����")){
			if(com==1){
				System.out.println("You Win");
			} else if(com == 2){
				System.out.println("DRAW");
			} else if(com == 3){
				System.out.println("You Lose");
			}
		} else if (sInput.equals("��")){
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