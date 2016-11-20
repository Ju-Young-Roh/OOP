import ch.aplu.turtle.*;
import java.util.*;

public class DrawSquareSave {
	
	static void drawSquareAtSave(int size, double x, double y) {
		Turtle t1 = new Turtle();
		Double[] pos=new Double[2];
		ArrayList<Double[]> posArr = new ArrayList<Double[]>();
		
		t1.home();
		t1.clear();
		
		t1.penUp();
	    t1.setPos(x,y);
	    t1.penDown();
	    
		
	    
	    for (int i=0;i<4;i++) {
	        t1.forward(size);
	        t1.right(90);
	        pos[0]= t1.getX();
	        pos[1]= t1.getY();
	        posArr.add(pos);
	        System.out.println(posArr.get(i));
	    }
	    
	}

		
	public static void main(String[] args) {
		
		drawSquareAtSave(100,10,20);
		
	}
}
