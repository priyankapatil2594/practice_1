package Demo;

import homework_method_calling.Circle;
import homework_method_calling.Rectangular;
import homework_method_calling.Square;


public class Demo {

	public static void main(String[] args) {
		
		Square s= new Square();
		Rectangular r= new Rectangular();
        Circle c= new Circle();
		
		int x= s.calculate_area(10); 
		int y= r.calculate_area(10,10);
		double z= c.calculate_area(10);
	
	System.out.println("Square area is "+x);
	System.out.println("Rectangular area is "+y);
	System.out.println("circle area is "+z);
	
		

	}

}
