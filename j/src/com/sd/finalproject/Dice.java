package com.sd.finalproject;

public class Dice {
	private int number = 0;
	
    public void roll() {   
        number = (int) (Math.random() * 6 + 1);
        //System.out.println("Turn on " + number);        
    }
    public void rollYoot(){
    	number = (int) (Math.random() * 5 + 1);
    }
    public int getNum() {
        return this.number;
    }
    
    
}
