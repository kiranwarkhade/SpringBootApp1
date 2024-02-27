package in.surykiran.SpringBootApp1;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//(scanBasePackages = {"in.surykiran.SpringBootApp1","in.surykiran.SpringBootApp1.Controller"})

//@ComponentScan(basePackages ={"SpringBootApp1.Controller"})
public class SpringBootApp1Application {

	public static void main(String[] args) {
		System.out.println("Running");
		SpringApplication.run(SpringBootApp1Application.class, args);
	}

}
