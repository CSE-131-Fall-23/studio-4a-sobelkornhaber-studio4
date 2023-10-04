package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean fill = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		double[] x = new double[3];
		double[] y = new double[3];
		StdDraw.setPenColor(red, green, blue);
		if(shapeType.equals("triangle"))
		{
			double parameterFive = in.nextDouble();
			double parameterSix = in.nextDouble();
			x[0] = parameterOne;
			x[1] = parameterThree;
			x[2] = parameterFive;
			y[0] = parameterTwo;
			y[1] = parameterFour;
			y[2] = parameterSix;
			if(fill)
				StdDraw.filledPolygon(x, y);
			else
				StdDraw.polygon(x, y);
		}
		else if(shapeType.equals("rectangle"))
		{
			if(fill)
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			else
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		else if(shapeType.equals("ellipse"))
		{
			if(fill)
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			else
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		

	}
}
