package triangle20;

import java.util.*;


public class TriangleType20 {



	public enum Type{
		SCALENE, ISOCELES, EQUILATERAL, NOTTRIANGLE;	
		@Override public String toString() {
			String s = super.toString();
			return s.substring(0, 1) + s.substring(1).toLowerCase();
		}
	}
	
	
	static Type getTriangleType(double x, double y, double z)
	{
		Boolean isTriangle=false;
		if(x + y >z)
		{
		   
		    isTriangle=true;

		}
		
		Type type = null;
		if(isTriangle==true)
		{
		 if(x!=y && y!=z && x!=z) {
			type = Type.SCALENE;
		} else if(x==y && y==z && z==x) {
			type = Type.EQUILATERAL;
		} else if(x==y || y==z || x == z) {
			type = Type.ISOCELES;
		}
		
		}
		else if(isTriangle==false)
		{
			type = Type.NOTTRIANGLE;
		}
		return type;
	}
	
	
	static Type getTriangleTypeCoordinates(double side1x,double side1y,double side2x,double side2y,double side3x,double side3y)
	{
		Boolean isTriangle=false;
		
		Type type = null;
		
		double xpart1 = (side2x-side1x);
		double xpartSquared1=Math.pow(xpart1, 2.0);
		double ypart1 = (side2y-side1y);
		double ypartSquared1=Math.pow(ypart1, 2.0);
		double x=Math.sqrt((xpartSquared1+ypartSquared1));
		
		double xpart2 = (side3x-side2x);
		double xpartSquared2=Math.pow(xpart2, 2.0);
		double ypart2 = (side3y-side2y);
		double ypartSquared2=Math.pow(ypart2, 2.0);
		double y=Math.sqrt((xpartSquared2+ypartSquared2));
		
		double xpart3 = (side3x-side1x);
		double xpartSquared3=Math.pow(xpart3, 2.0);
		double ypart3 = (side3y-side1y);
		double ypartSquared3=Math.pow(ypart3, 2.0);
		double z=Math.sqrt((xpartSquared3+ypartSquared3));
		
		if(x + y >z)
		{
		   
		    isTriangle=true;

		}
		
		
		if(isTriangle==true)
		{
		 if(x!=y && y!=z && x!=z) {
			type = Type.SCALENE;
		} else if(x==y && y==z && z==x) {
			type = Type.EQUILATERAL;
		} else if(x==y || y==z || x == z) {
			type = Type.ISOCELES;
		}
		}
		else if(isTriangle==false)
		{
			type = Type.NOTTRIANGLE;
		}
		
		return type;
	}
	
	static String isRightAngle(double side1, double side2, double side3)
	{
		
		String triangle=" and right";
		String notRight="";
		double side1squared=(side1*side1);
	    double side2squared=(side2*side2);
	    double side3squared=(side3*side3);
	    
	    double side1squaredRounded = Math.round(side1squared * 100.0) / 100.0;
	    double side2squaredRounded = Math.round(side2squared * 100.0) / 100.0;
	    double side3squaredRounded = Math.round(side3squared * 100.0)/100.0;	
		
	if (side1 > side2 && side1 > side3) {

	if (side1squaredRounded == (side2squaredRounded) + side3squaredRounded)
	return triangle;


	} else if (side2 > side1 && side2 > side3) {

	if (side2squaredRounded == side1squaredRounded + side3squaredRounded)
	return triangle;


	} else {

	if (side3squaredRounded == side1squaredRounded + side2squaredRounded)
	return triangle;


	}
	return notRight;

	}
	static String determineArea(double side1, double side2, double side3)
	{
		String results="";
		double triangleSemiPerimeter=0.0;
		double areaFormula=0.0;
		double triangleArea=0.0;

		triangleSemiPerimeter=(side1+side2+side3)/2;
		areaFormula=triangleSemiPerimeter*(triangleSemiPerimeter-side1)*(triangleSemiPerimeter-side2)*(triangleSemiPerimeter-side3);
		triangleArea=Math.sqrt(areaFormula);
		triangleArea=Math.round(triangleArea * 100.0)/100.0;
		
		return results+="Area is: "+triangleArea;

		
	}
	static double distanceFormula(double side1x,double side1y,double side2x,double side2y)
	{
	
		double xpart = (side2x-side1x);
		double xpartSquared=Math.pow(xpart, 2.0);
		double ypart = (side2y-side1y);
		double ypartSquared=Math.pow(ypart, 2.0);
		double distanceFormula=Math.sqrt((xpartSquared+ypartSquared));
		
		return distanceFormula;
		
		
	}
	static String determineAreaCoordinates(double side1, double side2, double side3)
	{
		String results="";
		String results2="Coordinates do not make a triangle!";
		double triangleSemiPerimeter=0.0;
		double areaFormula=0.0;
		double triangleArea=0.0;

		triangleSemiPerimeter=(side1+side2+side3)/2;
		areaFormula=triangleSemiPerimeter*(triangleSemiPerimeter-side1)*(triangleSemiPerimeter-side2)*(triangleSemiPerimeter-side3);
		triangleArea=Math.sqrt(areaFormula);
		triangleArea=Math.round(triangleArea * 100.0)/100.0;
		
		if(triangleArea!=0.0)
		{
			return results+="Area is: "+triangleArea;
		}
		else
		{
		return results2;
		}

		
	}
	
	
	
	public static void main(String[] args) {
		int triangleChoice=0;

		double side1,side2,side3;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Press 1 for triangle by inputing 3 sides.");
		System.out.println("Press 2 for triangle by coordinates");
		triangleChoice= scnr.nextInt();

		if(triangleChoice==1)
		{
		System.out.print("Enter side 1 length: ");

		side1 = scnr.nextDouble();

		System.out.print("Enter side 2 length: ");

		side2 = scnr.nextDouble();

		System.out.print("Enter side 3 length: ");

		side3 = scnr.nextDouble();
		
		
		Type type = getTriangleType(side1, side2, side3);
		System.out.println(determineArea(side1,side2,side3));
		
		System.out.println("Triangle Type: " + type.toString()+isRightAngle(side1,side2,side3));
		}
		if(triangleChoice==2)
		{
			double side1x=0.0;
			double side1y=0.0;
			double side2x=0.0;
			double side2y=0.0;
			double side3x=0.0;
			double side3y=0.0;
				
			System.out.print("Enter x coordinate then enter then y coordinate then enter for side 1:");
			side1x = scnr.nextDouble();
			side1y = scnr.nextDouble();
			
			System.out.print("Enter x coordinate then enter then y coordinate then enter for side 2:");
			side2x = scnr.nextDouble();
			side2y = scnr.nextDouble();

			System.out.print("Enter x coordinate then enter then y coordinate then enter for side 3:");

			side3x = scnr.nextDouble();
			side3y = scnr.nextDouble();
			
		getTriangleTypeCoordinates(side1x,side1y,side2x,side2y,side3x,side3y);
		//Type type = getTriangleTypeCoordinates(side1Coordinate, side2Coordinate, side3Coordinate);
		//System.out.println("Triangle Type: " + type.toString()+isRightAngle(side1Coordinate, side2Coordinate, side3Coordinate));
		//System.out.println(determineAreaCoordinates(side1Coordinate,side2Coordinate,side3Coordinate));
		}
	}

}