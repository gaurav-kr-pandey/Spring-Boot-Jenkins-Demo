package demo.dockerspringboot.dockerspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("demo.dockerspringboot.dockerspringbootdemo.bean")
@SpringBootApplication
public class DockerSpringbootDemoApplication {

	public static void main(String[] args) {
		System.out.println(" Hi! This is Demo Application ");
		SpringApplication.run(DockerSpringbootDemoApplication.class, args);
	}

}
