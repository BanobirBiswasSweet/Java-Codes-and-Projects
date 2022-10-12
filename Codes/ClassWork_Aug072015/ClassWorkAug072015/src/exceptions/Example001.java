package exceptions;

public class Example001 {

	public static void main(String[] args) {
		
		System.out.println("Main starts here");
		
		try{
			
			int x = 5/0;
			
			int[] a = new int[5];
			a[7] = 2;
			
		}
		catch(Exception e){
			
			System.out.println("The exception that has occurred is " + e.toString());
			
		}
		
		/*catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Array error here");
		}
		catch(ArithmeticException e){
			
			System.out.println("Arithmetic Error here");
		}
		*/
		
		System.out.println("Main ends here");
	}

}
