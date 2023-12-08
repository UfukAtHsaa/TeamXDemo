package de.hsaa.teamx.teamx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TeamXApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamXApplication.class, args);
    }

}
