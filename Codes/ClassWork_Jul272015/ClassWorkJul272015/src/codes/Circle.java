package codes;

public class Circle {
	
		private double radius; // attribute defined here
		
		
		public Circle(double radius){
			
			if(radius > 0)
				this.radius = radius;
			else
				this.radius = -1 * radius;
		}
		
		public double getRadius() {
			return radius;
		}


		public void setRadius(double radius) {
			this.radius = radius;
		}


		public double area(){
			
			return radius * radius * Math.PI;
			
		}
		
		public double circumference(){
			
			return 2 * Math.PI * radius;
			
		}
		
		
		public String toString(){
			
			return "This is a circle of radius = " + radius;
		}
		
		
}
