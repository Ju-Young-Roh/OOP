package com.sd.inherit;

public class CircleMain{
  public static void main(String[] args){
    Circle c = new Circle(10,10,5);
    double res = c.getArea();
    
    System.out.println(res);
  }
}