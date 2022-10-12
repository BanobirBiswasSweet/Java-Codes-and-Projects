package inheritance002;

public class SalesLine {
		
		private Product product;
		private double quantity;
		private double subTotal;
		
		public SalesLine(Product product, double quantity){
			this.product=product;
			this.quantity=quantity;
			
			//this.subTotal=product.getPrice()*quantity;
		}
		
		public void setProduct(Product product){
			
			this.product=product;
		}
		
		public Product getProduct(){
			
			return product;
		}
		
        public void setQuantity(double quantity){
			
			this.quantity=quantity;
		}
		
		public double getQuantity(){
			
			return quantity;
		}
		
		public double getSubTotal(){
			
			return subTotal=quantity*product.getPrice();
		}

}
