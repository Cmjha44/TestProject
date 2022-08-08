

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
//we are creating employee table in DB(rab3dbms)
@Table(name="emp_tbl")
public class Employee {
    
    private int empiId;
    private String name;
    private String country;
    private int salary;
    
    public Employee() {
        super();
            }
    public Employee(int empiId, String name, String country, int salary) {
        super();
        this.empiId = empiId;
        this.name = name;
        this.country = country;
        this.salary = salary;
    }
    
    public Employee(String name, String country, int salary) {
        super();
        
        this.name = name;
        this.country = country;
        this.salary = salary;
    }
    
    @Id  //we are making empId as a primary key
    @GeneratedValue  // for auto generated and auto incremented of primary key value
	public int getEmpiId() {
		return empiId;
	}
	@Override
	public String toString() {
		return "Employee [empiId=" + empiId + ", name=" + name + ", country=" + country + ", salary=" + salary + "]";
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

    
    
    
    
}
