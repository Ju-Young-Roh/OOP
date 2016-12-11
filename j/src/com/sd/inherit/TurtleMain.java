package com.sd.inherit;

public class TurtleMain{
  public static void main(String[] args){
    SeaTurtle st = new SeaTurtle();
    LandTurtle lt = new LandTurtle();
    
    st.setFood("seaweeds");
    lt.setFood("plants");
    
    st.eat();
    lt.eat();
    
    st.swim();
    lt.walk();
  }
}