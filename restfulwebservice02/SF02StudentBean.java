package restfulwebservice02;

import java.time.LocalDate;

public class SF02StudentBean {
	
	private Long id;
	private String name;
	private String email;
	private LocalDate dob; // Local Date
	private Integer age;
	//Constructor below: 
	public SF02StudentBean(Long id, String name, String email, LocalDate dob, Integer age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	// At the end of the page, let’s create an string method . 
	// When we create an object, it should be displayed on the console.  
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", email=" + email + ",dob=" + dob + ", age=" + age;
	}
	

}
