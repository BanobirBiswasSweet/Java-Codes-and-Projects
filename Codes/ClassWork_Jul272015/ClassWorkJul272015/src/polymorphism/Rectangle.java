package polymorphism;

public class Rectangle extends Shape {
	
		private double length ,width;
		
		public Rectangle(){
			
			super();
			
			this.length = 1;
			this.width = 1;
			
		}
		
		public Rectangle(double width,double length){
			
			super();
			
			if(length > 0)
				this.length = length;
			
			if(width > 0)
				this.width = width;
		}

		
		public Rectangle(double width,double length,String color, boolean filled){
			
				super(color,filled);
			
				if(length > 0)
					this.length = length;
				
				if(width > 0)
					this.width = width;
			
		}
		
		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double area(){
			
			return length * width;
		}
		
		public double getPerimeter(){
			
			return 2 * (length + width);	
			
		}
		
		public String toString(){
			
			return "A Rectangle with width = " + width 
					+ " and length = " + length + "\t" +
					" which is a subclass of " +
					super.toString();
			
		}
		
		
		
	
	

}
