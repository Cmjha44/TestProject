package thisDemo;

public class ThisDemo {
  int num1;   // all these 3 variables are instance variables
  int num2;
  String str;
  
  public ThisDemo() {
		 
		 
	  }
  
  
  public ThisDemo(int num1,String str) {
	 this.num1=num1;
	 this.str=str;
	 
  }
	
  public ThisDemo(String str, int num1) {
	  this.str=str;
	  this.num1=num1;
  }
	
}