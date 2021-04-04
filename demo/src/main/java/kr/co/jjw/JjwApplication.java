package kr.co.jjw;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackageClasses = JjwApplication.class)
public class JjwApplication {

	public static void main(String[] args) {
		SpringApplication.run(JjwApplication.class, args);
	}

}
