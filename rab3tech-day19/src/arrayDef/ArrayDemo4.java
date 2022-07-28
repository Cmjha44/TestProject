package arrayDef;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int arr[]=new int[] {2,4,6,8};
		System.out.println("priniting the array values using for loop");
		for(int x=0;x<arr.length;x++) {
			
			
			System.out.println(arr[x]);
			arr[x]=arr[x]*2;
		}
		// here we are multiplying by 2 in existing array values
		System.out.println("----------After multiplication, print updated data");
		for(int x=0;x<arr.length;x++)  {
			System.out.println(arr[x]);   //4 ,8, 12, 6
		}
	}

}
