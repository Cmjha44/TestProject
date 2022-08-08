import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	private int empiId;
	private String name;
	private String country;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empiId, String name, String country, int salary) {
		super();
		this.empiId = empiId;
		this.name = name;
		this.country = country;
		this.salary = salary;
	}
	@Id
	public int getEmpiId() {
		return empiId;
	}
	public void setEmpiId(int empiId) {
		this.empiId = empiId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Enpoyee [empiId=" + empiId + ", name=" + name + ", country=" + country + ", salary=" + salary + "]";
	}
	
	
	
	
}
