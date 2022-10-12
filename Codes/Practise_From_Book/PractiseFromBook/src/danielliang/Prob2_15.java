package danielliang;

public class Prob2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base=100;
		double rate=(1+0.00417);
		double total=(base*rate);
		double count=0;
		
		for(int i=1; i<=6; i++) {
			count=total;
			 total=(base+count)*rate;
		}
		
		System.out.println("Total amount is:: "+total);

	}

}
