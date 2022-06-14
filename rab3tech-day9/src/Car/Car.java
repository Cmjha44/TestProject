package Car;

public class Car {

	
	int model_year=2022; 
	
	String car_make="Tesla";
	String type="Model Y";
	String car_num="PAS1234";
	String color="Black";
	
	
	
public Car() {//default constructor
		
	}
	
	//parameterized constructors
	public Car(int m, String car, String c, String t) {
		model_year=m;
		car_num=car;
		color=c;
		type=t;
	}
	
	public Car(int m) {
		model_year=m;

	}
	public Car(String car) {
		car_num=car;
	}
	public Car(int m, String car) {
		model_year=m;
		car_num=car;
	}
	public Car(String c, String t) {
		color=c;
		type=t;
	 
	}
	
}
