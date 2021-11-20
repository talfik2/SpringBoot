package restfulwebservice03;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import restfulwebservice02.SF02StudentBean;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class SF03StudentBeanConfig {
    @Bean
    CommandLineRunner commandLineRunner1(SF03StudentBeanRepository studentRepo) {
        return args -> {
            SF03StudentBean Tommy = new SF03StudentBean(101L, "Tommy", "ac@gmail.com", LocalDate.of(2002, 5, 12));
            SF03StudentBean Arthur = new SF03StudentBean(102L, "Arthur", "vh@gmail.com", LocalDate.of(2003, 5, 12));
            SF03StudentBean John = new SF03StudentBean(103L, "John", "ms@gmail.com", LocalDate.of(2004, 5, 12));
            studentRepo.saveAll(List.of(Tommy, Arthur, John));
        };
    }

}
