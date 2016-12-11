package com.sd.finalproject;

public class Game {
	Player p1;
    Player p2;
    String name1, name2;
    int aWin, bWin =0;
    
    public void startGame() {
        p1 = new Player(name1);
        p2 = new Player(name2);
        p1.play();
        p2.play();
        if (p1.getNum() > p2.getNum()) {
            System.out.println(p1.getName() + " won");
            aWin++;
        }
        else if (p1.getNum() == p2.getNum()) {
            System.out.println(" draw");
        }
        else if(p1.getNum() < p2.getNum()){
        	System.out.println(p2.getName() + " won");
        	bWin++;
        }
        else
        	System.out.println("ERROR!!");
    }
}
