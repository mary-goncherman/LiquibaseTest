package liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleFunction;

@SpringBootApplication
@EnableJpaRepositories
public class LiquibaseTestApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(LiquibaseTestApplication.class, args);

//        List<String> list = List.of("1", "2");
//        Collections.sort(list, String::compareTo);
    }
}
