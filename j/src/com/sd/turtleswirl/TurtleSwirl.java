package com.sd.turtleswirl;
import ch.aplu.turtle.*;

public class TurtleSwirl{
  static int size = 5;
  static int bigger = 15;
  static int turns = 20;
  static double degree = 90.0;
  
  public static void main(String[] args){
    makeSwirlSquare(size, bigger, turns, degree);
  }
  
  static void makeSwirlSquare(int size, int bigger, int turns, double degree){
    Turtle t1 = new Turtle();
    int nBigger = 2;
    for(int i=0; i<turns; i++){
      if(i%nBigger != 0){
        size+=bigger;
      }
      t1.forward(size);
      t1.right(degree);
    }
  }
}