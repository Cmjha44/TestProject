

//persistence is in POJO class
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity // we are creating employee table in rab3dbms
public class Employee {
    
    private int empId;
    private String name;
    private String country;
    private int salary;
    
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public Employee(int empId, String name, String country, int salary) {
        super();
        this.empId = empId;
        this.name = name;
        this.country = country;
        this.salary = salary;
    }
    
@Id // we are making empId as a primary key
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
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
        return "Employee [empId=" + empId + ", name=" + name + ", country=" + country + ", salary=" + salary + "]";
    }
    
    
}