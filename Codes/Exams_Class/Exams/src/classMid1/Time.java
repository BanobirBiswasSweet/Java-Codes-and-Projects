package classMid1;

public class Time {

	private int second;
	private int minute;
	private int hour;
	
	public Time(int second, int minute, int hour) {
		setTime(second, minute, hour);
	}
	
	public void setTime(int second, int minute, int hour){
		setSecond(second);
		setMinute(minute);
		setHour(hour);
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second >= 0 && second < 60){
			this.second = second;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute >= 0 && minute < 60){
			this.minute = minute;			
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour >= 0 && hour < 24){
			this.hour = hour;
		}
	}
	
	public String toString(){
		return hour + ":" + minute + ":" + second;
	}
	
	public Time nextMinute(){
		minute += 1;
		
		if(minute > 59){
			minute = 0;
			nextHour();
		}
		
		return this;
		// or return new Time(second, minute, hour);
	}
	
	public Time nextSecond(){
		second += 1;
		
		if(second > 59){
			second = 0;
			nextMinute();
		}
		
		return this;
		// or return new Time(second, minute, hour);
	}
	
	public Time nextHour(){
		hour += 1;
		
		if(hour > 23){
			hour = 0;
		}
		
		return this;
		// or return new Time(second, minute, hour);
	}
	
	public Time previousSecond(){
		second -= 1;
		
		if(second < 0){
			second = 59;
			previousMinute();
		}
		
		return this;
		// or return new Time(second, minute, hour);
	}
	
	public Time previousMinute(){
		minute -= 1;
		
		if(minute < 0){
			minute = 59;
			previousHour();
		}
		
		return this;
		// or return new Time(second, minute, hour);
	}
	
	public Time previousHour(){
		hour -= 1;
		
		if(hour < 0){
			hour = 23;
		}
		
		return this;
		// or return new Time(second, minute, hour);
	}
}