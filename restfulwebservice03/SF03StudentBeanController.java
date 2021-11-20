package restfulwebservice03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SF03StudentBeanController {
    private SF03StudentBeanService studentService;
    // Constructor
    @Autowired
    public SF03StudentBeanController(SF03StudentBeanService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "api/v1/allStudents")
    public List<SF03StudentBean> getAllStudents() {
        return studentService.listStudents();
    }
}
