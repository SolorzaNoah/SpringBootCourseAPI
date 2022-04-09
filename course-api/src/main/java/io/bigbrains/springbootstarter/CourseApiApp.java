package io.bigbrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Annotation tells springboot this is the starting point
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//Create sublet container and host app inside
		SpringApplication.run(CourseApiApp.class, args);
		}

}
