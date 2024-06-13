package top.anyel.angular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.liseth.angular.model")
@EnableJpaRepositories(basePackages = "com.liseth.angular.repository")
public class MySqlAngularFormApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySqlAngularFormApplication.class, args);
    }
}