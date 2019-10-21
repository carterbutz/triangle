
	
	//Program Description: Program allowing you to use place inputs in the formula and get an output that is the area of the triangle according to the inputs given.


import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
	//declare variables
	double area;
	
	//declare a scanner object
	Scanner scan = new Scanner(System.in);
	
	//get user input for all three sides
	System.out.print("Enter side x in feet: ");
	double x = scan.nextDouble();
	
	System.out.print("Enter side y in feet: ");
	double y = scan.nextDouble();

	System.out.print("Enter side z in feet: ");
	double z = scan.nextDouble();
	
	double s = (0.5 * (x + y + z));
	
	//calculation
	area = Math.sqrt(s*(s - x)*(s - y)*(s - z));
	System.out.println("Area of the Triangle in square feet is: " + area);
	//Conversion here to change it into meters
	area = (area*0.092903);
	System.out.print("Area of the Triangle in square meters is: " + area);
	
	}

}