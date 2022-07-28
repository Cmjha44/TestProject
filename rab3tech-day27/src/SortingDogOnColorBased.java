import java.util.Comparator;

public class SortingDogOnColorBased implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		int x=(o1.color).compareTo(o2.color); //Ascending order
		// int x=(o2.color).compareTo(o1.color);//Descending order
		return x;
	}

}
