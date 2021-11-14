package restfulwebservice02;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SF02Controller {
	
	private SF02Service studentService; // So that I can access to Service Class from the Controller Class.
	SF02Controller(SF02Service studentService){
		this.studentService = studentService; // Constructor for Connection
	}
	
	@GetMapping(path = "api/v1/students") // path = "api" because the request that we have talked about today are for API
	// v1 = version1 as we create API right now. After you created API and want to update it, you can use "v2" or "v3"
	// That API is for "students". Maybe in the same API, I 'll get "parents" as well.
	
	// It’ll return the list of students by
	public List<SF02StudentBean> getStudents1(){
		return studentService.listStudents();
	}
	
}
