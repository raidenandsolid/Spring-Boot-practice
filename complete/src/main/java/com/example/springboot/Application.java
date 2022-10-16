package com.example.springboot;

import java.util.Arrays;
import java.util.List;

import com.example.springboot.entities.Username;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//	}
//
//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}
//
//}

// Application to Connect to Oracle DB
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM username";
		System.out.println("Select = " + sql);

		List<Username> Users = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Username.class));
		Users.forEach(System.out :: println);
	}
}