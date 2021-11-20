package restfulwebservice02;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class SF02Service {

    List<SF02StudentBean> studentList = List.of(
                                            new SF02StudentBean(101L, "Tommy", "ac@gmail.com", LocalDate.of(2002, 5, 12)),
                                            new SF02StudentBean(102L, "Arthur", "vh@gmail.com", LocalDate.of(2003, 5, 12)),
                                            new SF02StudentBean(103L, "John", "ms@gmail.com", LocalDate.of(2004, 5, 12))
                                            );
    public List<SF02StudentBean> listStudents() {
        return studentList;

    }
    public SF02StudentBean selectStdById(Long id) {
        return studentList.stream().filter(t->t.getId() == id).collect(Collectors.toList()).get(0);
    }
}
