package com.sd.listsum;
import java.util.*;

public class ListSum {
		
	public static void main(String[] args) {
		int sum = 0;
		List<Integer> myList = new ArrayList<Integer>();
		
		for(int i=1;i<1001;i++){
			if(i%4==0&&i%5!=0){
				myList.add(i);
			}
		}
		for(int j=0;j<myList.size();j++){
			sum += myList.get(j);
		}
		System.out.println(sum);
	}
}
