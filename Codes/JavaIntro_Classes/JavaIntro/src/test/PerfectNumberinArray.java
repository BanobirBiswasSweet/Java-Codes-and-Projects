package test;

public class PerfectNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[]= {1, 3, 5, 6, 7};
		int sum=0;
		
		for(int i=0; i<x.length; i++) {
			for(int j=1; j<x[i]; j++) {
				if(x[i]%j==0) {
					sum=sum+j;
					x[i]=x[i]/j;
				}
			}
			if(x[i]==sum) {
				System.out.println(x[i]);
			}
		}

	}

}
