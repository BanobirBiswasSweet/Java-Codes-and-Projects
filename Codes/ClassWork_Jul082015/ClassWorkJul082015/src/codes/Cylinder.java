package codes;

public class Cylinder extends Circle {
	
		private double height;
		
		public Cylinder(double radius,double height){
			
			super(radius);     // we are creating a Circle object her
			setHeight(height);
			
		//this can be used too
			
		/*	if(height > 0)
				this.height = height;
			else
				this.height = -1 * height;
			*/
			
		}
	
	
		public void setHeight(double height){
			
			if(height > 0)
				this.height = height;
			else
				this.height = -1 * height;
			
			
		}
		
		
		public double getHeight(){
			return height;
		}
		
		public double volume(){
			
			return super.area() * height;
		}
		
		public double surfaceArea(){
			
			return super.circumference() * height + 2 * super.area();
		}

}
