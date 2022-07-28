package hashCode;

public class Dog implements Comparable<Dog> {
	int age;
	String name;

	
	public Dog() {
		super();
		
	}
	
	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;

	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Dog o) {
									        //int x=this.age-o.age; //ascending order
		int x=o.age-this.age;				//descending
		return x;
	}

	
	
	
	
	
	
}
