package demo.dockerspringboot.dockerspringbootdemo.bean;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository repo;
	
	@GetMapping("/student/{rollNo}")
	public Optional<Student> getStudent(@PathVariable("rollNo") int id) {
		return repo.findById(id);
	}

	@GetMapping("/create")
	public void getStudent() {
		Student s = new Student();
		s.setName("Gaurav Kumar Pandey");
		s.setStd(5);
		s.setSection("A");
		repo.save(s);
	}
	@PostMapping("/student")
	public void saveStudent(@RequestBody Student std) {
		repo.save(std);
	}
}
