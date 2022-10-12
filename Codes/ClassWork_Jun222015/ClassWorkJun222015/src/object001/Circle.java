package object001;

public class Circle {

		public double radius; // attribute of Circle defined here
		
		public Circle(double radius){
			
			if(radius > 0)
				this.radius = radius;
			else 
				this.radius = -1 * radius;
		}
		
		
		public double area(){
			
			return Math.PI * radius * radius;
		}
		
		
		public double circumference(){
			
			return Math.PI * radius * 2;
			
		}

}
