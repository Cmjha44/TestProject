package stringDemo;

public class MainCar {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.getPrice());
		System.out.println(c1.getModel());
		System.out.println(c1.getColor());

		System.out.println(c1); // 0 null null

		Car c2 = new Car(9000, "BMW", "white");
		System.out.println(c2.getPrice()); // 9000
		System.out.println(c2.getModel()); // BMW
		System.out.println(c2.getColor()); // white

		System.out.println(c2); // 9000 BMW white

	}

}
