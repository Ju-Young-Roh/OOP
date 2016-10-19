package com.sd;
import ch.aplu.turtle.*;

public class p1_TurtleMain{
      enum Shape {TRIANGLE, SQUARE};
  public static void main(String[] args){
      p1_TurtleSquare pt = new p1_TurtleSquare();
      
      Shape shape;
      shape = Shape.TRIANGLE;
    
      switch(shape){
        case TRIANGLE:
          pt.drawTriangle(100);
          break;
        case SQUARE:
          pt.drawSquare(100);
          break;
        default:
          System.out.println("Nothing selected");
          break;
      } 
  }
}