package com.sd.finalproject;

public class Player {
	private String name=null;
    int num, num2, sum=0;
    boolean win = false;
    
    public Player(String _name) {
        name=_name;
    }
    public void play() {
        Dice d=new Dice();

        d.roll();
        num=d.getNum();
        d.roll();
        num2 = d.getNum();
        
        sum = num+num2;
        
        System.out.println(name + "'s sum is : "+sum);        
    }
    public void playYoot() {
        Dice d=new Dice();

        while(sum<21){
        	d.rollYoot();
        	num=d.getNum();
        	sum += num;
        }

        System.out.println(name + "'s sum is : "+sum);       
    }
    public String getName() {
        return this.name;
    }

    public int getNum() {
        return this.sum;
    }
}
