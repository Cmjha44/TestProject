package superConstructor;

public class HeroMotor extends Motor{
	String vendor="Sushma";
	
	public HeroMotor() {
		super();
	}
	
	
	public void show() {
		System.out.println("Name="+name);
		System.out.println("vendor="+vendor);
	}
}
