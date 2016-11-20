import java.util.*;

public class ReverseString {
			
	public static void main(String[] args) {
		String input = ""; 
		String res = "";
		int cnt;
		
		System.out.println("Make string input : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		
		for(int i = input.length()-1; i>=0; i--){
			res += input.charAt(i);
		}
		
		System.out.println("reversed string is : "+res);
	}
}
