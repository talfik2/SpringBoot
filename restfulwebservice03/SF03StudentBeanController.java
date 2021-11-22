package restfulwebservice03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path="/api/v1/allStudents/{id}")
    public SF03StudentBean getStdById(@PathVariable Long id) {

        return studentService.selectStdById(id);
    }
    //@DeleteMapping(path = "api/v1/deleteStudents/{id}")
    //public String deleteStdById(@PathVariable Long id) {
    //    return studentService.deleteStdById(id);
    //}
    @PutMapping(path = "api/v1/updateStudents/{}")
    public ResponseEntity<SF03StudentBean> updateStudent(@PathVariable Long id, @Validated @RequestBody SF03StudentBean student) {
        // After updating, you need to return updated data.
        // Thus, we are using response entity with ok method.
        return ResponseEntity.ok(studentService.updateStudent(id, student));
    }
}


