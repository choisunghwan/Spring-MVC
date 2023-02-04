package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan //서블릿 자동 등록: 스프링이 자동으로 패키지를 다 뒤져서 서블릿을 다 찾아서 자동으로 실행 시켜 주는 녀석
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

}
