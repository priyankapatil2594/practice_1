package Demo;

public class Result_Square_varibles {
	
	public static void main(String[] args) {
		
			Square_variables square= new Square_variables();
		
       square.side=10;
       
       //square.calculate_area();
       //Square_variables.calculate_peri();
       
       System.out.println("area is  "+  square.calculate_area() );
	
       System.out.println("peri is  " +  square.calculate_peri() );
	}
	
	

}
