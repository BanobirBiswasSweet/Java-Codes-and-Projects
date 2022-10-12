package danielliang;

public class Prob4_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sum=1.0;
		double fact=1.0;
		
		for(int i=10000; i<=100000; i+=10000){
		for(int n=1; n<=i; n++){
			fact=fact*n;
			double e=1/fact;
			sum=sum+e;
		}
		System.out.println("When i= "+i+", Approximate value of e= "+sum);
		}

	}

}
