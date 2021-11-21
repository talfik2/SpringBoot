package restfulwebservice03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SF03StudentBeanService {
    private SF03StudentBeanRepository studentRepo;
    // Constructor
    @Autowired
    public SF03StudentBeanService(SF03StudentBeanRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<SF03StudentBean> listStudents() {
        return studentRepo.findAll();
    }
    public SF03StudentBean selectStdById(Long id) {
        if(studentRepo.findById(id).isPresent()) {
            return studentRepo.findById(id).get();
        }else{
            return new SF03StudentBean();
        }
    }

    public String deleteStdById(Long id) {
        if(studentRepo.findById(id).isPresent()) {
            studentRepo.deleteById(id);
            return "Student whose is is " + id + "is successfully deleted";
        }else {
            return id + "does not exist";
        }
    }

    public SF03StudentBean updateStudent(Long id, SF03StudentBean newStudent) {

        SF03StudentBean existingStudentById = studentRepo
                .findById(id)
                .orElseThrow(() -> new IllegalStateException(id + " id does not exist.."));

        String name = existingStudentById.getName();
        if (newStudent.getName() == null) {
            existingStudentById.setName(null);
        } else if (existingStudentById.getName() == null) {
            existingStudentById.setName(newStudent.getName());
        } else if (!name.equals(newStudent.getName())) {
            existingStudentById.setName(newStudent.getName());
        }
        return studentRepo.save(newStudent);
    }
}

