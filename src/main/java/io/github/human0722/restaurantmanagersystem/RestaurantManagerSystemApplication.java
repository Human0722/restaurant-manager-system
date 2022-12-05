package io.github.human0722.restaurantmanagersystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.github.human0722.restaurantmanagersystem.dao")
public class RestaurantManagerSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantManagerSystemApplication.class, args);
    }

}
