import java.util.Comparator;

public class SortingOnName implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		// int x=(o2.name).compareTo(o1.name); //descending order
		int x=(o1.name).compareTo(o2.name); //
		return x;
	}

	

	}


