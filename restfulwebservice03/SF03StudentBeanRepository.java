package restfulwebservice03;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SF03StudentBeanRepository  extends JpaRepository<SF03StudentBean, Long> {
}
