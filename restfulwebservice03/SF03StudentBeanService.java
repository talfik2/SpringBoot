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
}
