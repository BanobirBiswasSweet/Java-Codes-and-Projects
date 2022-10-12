package prob_004;

public class QuizScript {

	private String id;
	private double total;
	private double mark;
	private boolean hasPassed;
	
	public QuizScript(String id, double total, double mark) {
		this.id = id;
		this.total = total;
		this.mark = mark;
		this.hasPassed = false;
		
		double passMark = total * 60 / 100.0;
		
		if(mark >= passMark){
			this.hasPassed = true;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public boolean isHasPassed() {
		return hasPassed;
	}

	public void setHasPassed(boolean hasPassed) {
		this.hasPassed = hasPassed;
	}
	
	static QuizScript max(QuizScript [] copies){
		
		QuizScript q = copies[0];
		
		for(int i = 1; i < copies.length; i++){
			if(copies[i] != null && copies[i].getMark() > q.getMark()){
				q = copies[i];
			}
		}
		
		return q;
	}
}