package restfulwebservice02;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SF02ControllerName {
	
	private SF02Service studentServiceName; // So that I can access to Service Class from the Controller Class.
	SF02ControllerName(SF02Service studentServiceName){
		this.studentServiceName = studentServiceName; // Constructor for Connection
	}
	
	@GetMapping(path = "api/v1/students") // path = "api" because the request that we have talked about today are for API
	// v1 = version1 as we create API right now. After you created API and want to update it, you can use "v2" or "v3"
	// That API is for "students". Maybe in the same API, I 'll get "parents" as well.
	
	// It’ll return the list of students by
	public List<SF02StudentBean> getStudents1(){
		return studentServiceName.listStudents();
	}
	@GetMapping(path = "api/v1/students/{id}")
	public SF02StudentBean getStudentById(@PathVariable Long id) {
		return (studentServiceName).selectStdById(id);
	}
}
