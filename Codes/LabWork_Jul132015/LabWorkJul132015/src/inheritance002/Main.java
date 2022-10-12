package inheritance002;

public class Main {

	public static void main(String[] args) {
		
		Product p=new Product(151, "Maruti-800", 300000.00);
		
		SalesLine s=new SalesLine(p, 4);
		
		System.out.println(s.getProduct().getId());
		System.out.println(s.getProduct().getName());
		System.out.println(s.getProduct().getPrice());
		System.out.println(s.getSubTotal());

	}

}
