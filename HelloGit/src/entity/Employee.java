package entity;

public class Employee {
	
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public Employee() {
		
	}
	
}
