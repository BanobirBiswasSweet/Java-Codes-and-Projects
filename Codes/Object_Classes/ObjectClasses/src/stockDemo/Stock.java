package stockDemo;

public class Stock {
	
	private String symbol;
	private String name;
	private double previousPrice;
	private double currentPrice;
	
	
	public Stock(String symbol, String name, double previousPrice, double currentPrice) {
		
		this.symbol=symbol;
		this.name=name;
		this.previousPrice=Math.abs(previousPrice);
		this.currentPrice=Math.abs(currentPrice);
	}
	
	public void setSymbol(String symbol) {
		
		this.symbol=symbol;
	}
	
	public String getSymbol() {
		
		return symbol;
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setPreviousPrice(double previousPrice) {
		
		this.previousPrice=Math.abs(previousPrice);
	}
	
	public double getPreviousPrice() {
		
		return previousPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		
		this.currentPrice=Math.abs(currentPrice);
		
	}
	
	public double getCurrentPrice() {
		
		return currentPrice;
	}
	
	public double getChangePercent() {
		
		return Math.abs((previousPrice-currentPrice)/100);
	}

}
