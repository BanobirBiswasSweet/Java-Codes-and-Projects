package prob_004;

public class Main {

	public static void main(String[] args) {
		
		QuizScript[] A=new QuizScript[2];
		
		A[0]=new QuizScript("151", 98.25, 60.75);
		A[1]=new QuizScript("152", 95.85, 58.90);
		
		System.out.println("Result:: "+A[0].isHasPassed());
		System.out.println("Result:: "+A[1].isHasPassed());		

	}

}
