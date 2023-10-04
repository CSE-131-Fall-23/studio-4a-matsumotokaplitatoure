package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	StdDraw.clear();
	StdDraw.setXscale(0, 66);
	StdDraw.setYscale(0, 48);
	StdDraw.setPenColor(173,216,230);
	StdDraw.filledRectangle(33, 8, 33, 8);
	StdDraw.setPenColor(0,0,100);
	StdDraw.filledRectangle(33, 32, 33, 16);
	StdDraw.setPenColor(255,255,204);
	StdDraw.filledEllipse(33,32,10,8);
	}
	
		   
}