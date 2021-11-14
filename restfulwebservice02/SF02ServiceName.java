package restfulwebservice02;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service // With @Service, SpringBoot knows SF02Service is a Service Layer, 
//and SF02Service has logic that we’ll use in the Controller Layer. 
public class SF02ServiceName {
	List <SF02StudentBean> studentList = List.of( // I put the things in below to the studentList container
									new SF02StudentBean(101L, "Tommy", "tommy@gmail.com", LocalDate.of(1995, 10, 23), 27),
									new SF02StudentBean(102L, "Arthur", "arthurs@gmail.com", LocalDate.of(1980, 5, 12),41),
									new SF02StudentBean(103L, "John", "johns@gmail.com", LocalDate.of(1999, 6, 11),21),
									new SF02StudentBean(104L, "Fin", "fins@gmail.com", LocalDate.of(2002, 5, 12),19)
			
			);
	
	public List<SF02StudentBean>listStudents() {
		return studentList;
	}
	
	public SF02StudentBean selectStdById(Long id) {
	// Let's put some logic here
		return studentList.stream().filter(t->t.getId()==id).collect(Collectors.toList()).get(0); // Let's use some lambda
		// When you use stream() it put them from top to down
		// By using filter(t->t.getId()==id), I say that Hey Java, get the id if id equals to given id,and return it
		// I put them into a list with collect(Collectors.toList()). 
		// Inside the list, I’ll have just a single student, because of that, I return the first one by get(0)
	}
	
	
}
