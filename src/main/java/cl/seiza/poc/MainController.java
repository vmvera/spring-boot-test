package cl.seiza.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cl.seiza.poc")
public class MainController {

    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);
    }


}
