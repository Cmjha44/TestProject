package hashCode;

public class HashCodeDemo2 {

	public static void main(String[] args) {
		String str="Chandra";
		System.out.println(str.hashCode());
		
		Character ch='c';
		System.out.println(ch.hashCode());
		
		Character ch1='D';
		System.out.println(ch1.hashCode());
		
		Character ch2='C';
		System.out.println(ch2.hashCode());
		
		System.out.println("-----------");
		
		Integer i=12345;
		System.out.println(i.hashCode());//12345
		System.out.println("-----------");
		
		Integer i2=33;
		System.out.println(i2.hashCode());//33

	}

}
