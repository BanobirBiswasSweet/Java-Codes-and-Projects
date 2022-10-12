package danielliang;
import java.util.Scanner;

public class Prob4_16 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer:: ");
		int n=input.nextInt();
		
		for(int i=2; n!=1; i++) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
		}
		input.close();

	}

}
