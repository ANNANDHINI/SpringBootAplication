# SpringBootAplication
Tools and Technologies Used
Java 17
Spring Boot 3
Spring MVC
Spring Data JPA ( Hibernate)
MySQL
Thymeleaf
Eclipse STS
1. Create Spring Boot Project
Let's open STS ( Spring Suite Tool) IDE to develop and bootstrap the Spring boot project.

Use the below guide to create a Spring boot project in Eclipse STS IDE: 
=> Create Spring Boot Project in Spring Tool Suite [STS]

Selected below dependencies while creating spring boot project using spring initializr:
- Spring Web
- Thymeleaf
- Spring Data JPA
- MySQL Driver
- Spring Boot Devtools
2. Create Spring Boot Project Structure
Let's create the below packages in our Spring boot project:
- controller
- service
- repository
- entity
3. Maven Dependencies
Note that we are using Spring Boot 3 and it requires minimum Java version 17 or later.
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
3. Create Student JPA Entity
@Entity - This annotation specifies that the class is an entity. This annotation can be applied to Class, Interface of Enums.
@Table  - JPA annotation specifies the table in the database with which this entity is mapped.
@Id - The @Id JPA annotation specifies the primary key of the entity.
@Column - The @Column annotation is used to specify the mapping between a basic entity attribute and the database table column.
5. Create JPA StudentRepository
6. Configure MySQL Database
7. StudentServiceImpl Class
8. Controller Layer
9. View Layer
10. Run Spring Boot Application
Run the Spring boot application with the main class:
package net.javaguides.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
}
10. Demo
Once the Spring boot application is up and running then use the below URL to access this application:
URL: http://localhost:8080/students
