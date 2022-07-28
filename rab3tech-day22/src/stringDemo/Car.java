package stringDemo;

public class Car {
	private int price;  //0
	private String model; //null
	private String color; //nul
	
	//default constructor
	public Car() {
		super();
			}

	//parameterized constructor
	public Car(int price, String model, String color) {
		super();
		this.price = price;
		this.model = model;
		this.color = color;
	}

	// getter & setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
@Override
	
	
	
	public String toString() {
		return "Car [price=" + price + ", model=" + model + ", color=" + color + "]";
	
	}

	
}
