package com.school.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.school.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepositry;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Enable me to pre-load data on startup when database is empty
		 * 
		 * 
		 * Student student1 = new Student("Miguel", "Sanchez", "miguelrol88@gmail.com");
		 * studentRepositry.save(student1); Student student2 = new Student("Edson",
		 * "Sanchez", "edsonovo@gmail.com"); studentRepositry.save(student2); Student
		 * student3 = new Student("Thami", "Palombo", "thami.palombo@gmail.com");
		 * studentRepositry.save(student3);
		 * 
		 */
	}

}
