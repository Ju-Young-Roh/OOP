package com.sd.finalproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel extends JFrame{
	static JFrame frame = new JFrame("Game");
	static JButton diceG = new JButton("Play Dice Game!");
	static JButton yootG = new JButton("Play YootNori!");
	JButton Btn = new JButton("»Æ¿Œ");
	JLabel lb1;
	String p1name;
	String p2name;
	
	public void createFrame(){
		frame.setLayout(new FlowLayout());
		frame.add(diceG);
		frame.add(yootG);
		
		frame.setSize(300, 300);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		diceG.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				
				frame.setLayout(new GridLayout(4,2));
				diceG.setVisible(false);
				yootG.setVisible(false);
				
				Label pl1 = new Label("Player 1's name");
				Label pl2 = new Label("Player 2's name");
				TextField p1Name = new TextField("");
				TextField p2Name = new TextField("");
				Container pane = frame.getContentPane();
				pane.add( pl1);
				pane.add( p1Name);
				pane.add(pl2);
				pane.add(p2Name);
				pane.add(Btn);
				Btn.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						p1Name.setVisible(false);
						p2Name.setVisible(false);
						pl2.setVisible(false);
						
						DiceGame dg1 = new DiceGame();
						p1name = p1Name.getText(); //.toString();
						dg1.name1 = p1name;
						p2name = p2Name.getText();//.toString();
						dg1.name2 = p2name;
						
						for(int i=0; i<3; i++){
							dg1.startGame();			
						}
						
						if(dg1.aWin>dg1.bWin){
							pl1.setText("winner is = "+ p1name);//dg1.p1.getName());
						}else if(dg1.aWin<dg1.bWin){
							pl1.setText("winner is = "+ p2name);//dg1.p2.getName());
						}else if(dg1.aWin==dg1.bWin){
							pl1.setText("Draw...");
						}else{
							pl1.setText("Error...");
						}
					}
				});
				
			}
			
		});
		
		yootG.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){


				frame.setLayout(new GridLayout(4,2));
				diceG.setVisible(false);
				yootG.setVisible(false);
				
				Label pl1 = new Label("Player 1's name");
				Label pl2 = new Label("Player 2's name");
				TextField p1Name = new TextField("");
				TextField p2Name = new TextField("");
				//pnl.add(pl1);
				Container pane = frame.getContentPane();
				pane.add( pl1);
				pane.add( p1Name);
				pane.add(pl2);
				pane.add(p2Name);
				pane.add(Btn);

				Btn.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						p1Name.setVisible(false);
						p2Name.setVisible(false);
						pl2.setVisible(false);

						
						YootNori yn = new YootNori();
						p1name = p1Name.getText(); //.toString();
						yn.name1 = p1name;
						p2name = p2Name.getText();//.toString();
						yn.name2 = p2name;
						
						for(int i=0; i<3; i++){
							yn.startGame();			
						}
						
						if(yn.aWin>yn.bWin){
							pl1.setText("winner is = "+ p1name);//dg1.p1.getName());
						}else if(yn.aWin<yn.bWin){
							pl1.setText("winner is = "+ p2name);//dg1.p2.getName());
						}else if(yn.aWin==yn.bWin){
							pl1.setText("Draw...");
						}else{
							pl1.setText("Error...");
						}
					}
				});
			}
		});

		
	}
}
