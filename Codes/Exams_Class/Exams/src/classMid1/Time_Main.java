package classMid1;


public class Time_Main {

	public static void main(String[] args) {
		
		Time t1=new Time(3, 28, 45);
		System.out.println(t1.previousSecond());
		System.out.println(t1.toString());
		
		Time t2=new Time(12, 25, 36);
		
		t2.setMinute(56);
		t2.setSecond(33);
		
		System.out.println(t2.toString());

	}

}
