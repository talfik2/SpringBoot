package restfulwebservice02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SF02Controller {
    private SF02Service studentService;

    //constructor
    SF02Controller(SF02Service studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "api/v1/students")
    public List<SF02StudentBean> getStudents1() {
        return studentService.listStudents();
    }

    @GetMapping(path = "api/v1/students/{id}")
    public SF02StudentBean getStudentById(@PathVariable Long id) {
        return studentService.selectStdById(id);
    }
}
