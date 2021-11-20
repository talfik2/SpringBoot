package restfulwebservice03;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.Period;
@Entity
@Table(name = "students")
public class SF03StudentBean {

    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;
    private String errMsg;

    // Getters & Setters
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
        if(this.dob.equals(null)) {
            return null;
        }else
        return Period.between(this.dob, LocalDate.now()).getYears();
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    //Constructor
    public SF03StudentBean(Long id, String name, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.errMsg = "No error...";

    }
    // Constructor for Worse Alternative
    public SF03StudentBean() {
        this.errMsg = "This is no any students like that...";
    }
    //Getters & Setter for Worse Alternative
    public String getErrMsg() {
        return errMsg;
    }
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }


    //toString()
    @Override
    public String toString() {
        return "SF02StudentBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
