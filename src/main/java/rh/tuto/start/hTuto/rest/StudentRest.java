package rh.tuto.start.hTuto.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rh.tuto.start.hTuto.Student;

@RestController()
@RequestMapping("/student")
public class StudentRest {

	@GetMapping("/new")
	public Student all() {
		return new Student();
	}

}
