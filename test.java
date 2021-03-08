package Demo;

import homework_method_calling.Circle;
import homework_method_calling.Rectangular;
import homework_method_calling.Square;

public class test {
     public static void main(String[] args) {
    	 
    	 int x= Rectangular.calculate_peri(11,12);
         
    	 int y=Square.calculate_peri(10);
    		
    		Circle c=new Circle();
    		double z= c.calculate_peri(10);
    		
    		
    		System.out.println("peri of rectangular is "+x);
    		System.out.println("peri of square is "+y);
    		System.out.println("peri of circle is "+z);
    		
    		
    		
    		
	}

}
