package sujeong.springbootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.setData("hello");
		String data = hello.getData(); // ctrl+alt+v
		System.out.println("data = "+data);

		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

}
