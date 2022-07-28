package superConstructor;

public class HeroMotor1 extends Motor1{
	String color;
	
	public HeroMotor1(String name,String color) {
		super();
		this.name=name;
		this.color=color;
	}
	
	
	public void show() {
		System.out.println("Name from Motor(Super class)="+name);
		System.out.println("color from sub class="+color);
	}}
