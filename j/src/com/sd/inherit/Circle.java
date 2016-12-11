package com.sd.inherit;

public class Circle extends Point{
  protected double radious;
  public Circle(int x, int y, double r){
    this.x = x;
    this.y = y;
    this.radius = r;
  }
  
  public double getArea(){
    double myArea;
    
    myArea = radius*radius*3.14;
    
    return myArea;
  }
}