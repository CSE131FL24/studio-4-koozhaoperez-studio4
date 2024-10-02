package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double[] xOne = {0.25 ,0.35, 0.45};
		double[] yOne = {0.4 ,0.6, 0.4};
		double[] xTwo = {0.4 ,0.5, 0.6};
		double[] yTwo = {0.4 ,0.6, 0.4};
		double[] xThree = {0.55 ,0.65, 0.75};
		double[] yThree = {0.4 ,0.6, 0.4};
	StdDraw.setPenColor(198, 214, 250); //flag
	StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);
	StdDraw.setPenColor(200, 182, 255); //left
	StdDraw.filledPolygon(xOne, yOne);
	StdDraw.setPenColor(231, 198, 255); //middle
	StdDraw.filledPolygon(xTwo, yTwo);
	StdDraw.setPenColor(255, 214, 255); //right
	StdDraw.filledPolygon(xThree, yThree);
	}
}