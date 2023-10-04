package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(23, 150, 200);
		StdDraw.filledRectangle(.5, .5, .5, .5);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(.25, .5, .05, .35);
		StdDraw.filledRectangle(.75, .5, .05, .35);

		StdDraw.filledRectangle(.2, .15, .1, .05);
		StdDraw.filledRectangle(.8, .15, .1, .05);
		
		StdDraw.setPenColor(100, 240, 20);
		StdDraw.setPenRadius(.03);
		StdDraw.ellipse(.5, .5, .2, .2);
		StdDraw.line(.5, .7, .5, .3);
		StdDraw.line(.5, .5, .359, .359);
		StdDraw.line(.5, .5, .6414, .359);
		
	}
}