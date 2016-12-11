package com.sd.inherit;

public class Turtle{
  private int nLimbs = 4;
  protected String food;
  
  public void setFood(String f){
    this.food = f;
  }
  public void eat(){
    System.out.println("Turtle eats " + food);
  }
}