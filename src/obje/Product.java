package obje;

public class Product {
	private String name;
	private double price;
	private double discountRate; 
	
	public double getLastPrice() {
		return this.price*(100-this.discountRate)/100;
	}	
	
	public void setDiscoundRate(double discoundRate) {
		this.discountRate=discoundRate;
		
	}
	public double getDiscoundRate() {
		return this.discountRate; 
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setPrice(double price) {
		this.price = price;

	}

	public double getPrice() {
		return this.price;
		

	}
}
