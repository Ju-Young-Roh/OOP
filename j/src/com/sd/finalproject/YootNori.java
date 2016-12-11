package com.sd.finalproject;

public class YootNori extends Game{
	Player p1;
    Player p2;
    String name1, name2;
    int aWin, bWin =0;
    
    public void startGame() {
        p1 = new Player(name1);
        p2 = new Player(name2);
        p1.playYoot();
        p2.playYoot();
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
