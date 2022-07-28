package hashCode;

public class HashCodeDemo1 {

	public static void main(String[] args) {
		String str="Chandra";
		String str1="Chandra";
		System.out.println(str.hashCode()+ "  "+str1.hashCode());

		System.out.println("---------");
		
		String str2=new String("Chandra");
		System.out.println(str1.hashCode()+ "  "+str2.hashCode());////same hashCode
		System.out.println(str1.equals(str2));//true
		
		//already they have overridden hashCode() and equals()


	}

}
