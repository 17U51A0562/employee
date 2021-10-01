/*
 * As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates
   using the Cartesian system, So that I can calculate its length
 * 
 */
package linecomparison;
import java.util.Scanner;
public class LinecomparisonUC1 {
public static void main(String[] args) {
	System.out.println("Calculate Length Of Line: ");

	Scanner line = new Scanner(System.in); 

	System.out.println("Enter the Value of x Co-ordinate 1st point: ");
	int x1 = line.nextInt();
	System.out.println("Enter the Value of y Co-ordinate  1nd point: ");
	int y1 = line.nextInt();
	System.out.println("Enter the Value of x Co-ordinate 2nd point: ");
	int x2 = line.nextInt();
	System.out.println("Enter the Value of y Co-ordinate 2nd point: ");
	int y2 = line.nextInt();

	double length_of_line1 = Math.sqrt((y2 - y1)^ 2 + (x2 - x1)^2);
	System.out.println("length_of_line1 = " + length_of_line1);
}
}

