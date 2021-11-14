package restfulwebservice02;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service // With @Service, SpringBoot knows SF02Service is a Service Layer, 
//and SF02Service has logic that we’ll use in the Controller Layer. 
public class SF02Service {
	
	public List<SF02StudentBean>listStudents() {
		
		return List.of(
				new SF02StudentBean(101L, // id = 101, as id's data type is long, we add L
						"Tommy", // name = "Tommy"
						"tommy@gmail.com",  // email = "tommy@gmail.com"
						LocalDate.of(1995, 10, 23), // day = dob = LocalDate(Year,Month,Day)
						27), // age = 27
				new SF02StudentBean(102L, "Arthur", "arthurs@gmail.com", LocalDate.of(1980, 5, 12),41),
				new SF02StudentBean(103L, "John", "johns@gmail.com", LocalDate.of(1999, 6, 11),21),
				new SF02StudentBean(104L, "Fin", "fins@gmail.com", LocalDate.of(2002, 5, 12),19)
				
				);
	}
	
}
