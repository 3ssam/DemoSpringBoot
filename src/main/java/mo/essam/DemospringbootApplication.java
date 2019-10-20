package mo.essam;

import mo.essam.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemospringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemospringbootApplication.class, args);
        context.getBean(Student.class).justMessage();
        context.getBean(Student.class).justMessage();
        context.getBean(Student.class).justMessage();
    }

}
