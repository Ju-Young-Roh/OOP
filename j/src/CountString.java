import java.util.*;

public class CountString {
	
			
	public static void main(String[] args) {
		String input;
		int cnt;
		
		System.out.println("Make string input : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		
		cnt = input.length();
		
		System.out.println("length of string is "+ cnt);
	}
}
