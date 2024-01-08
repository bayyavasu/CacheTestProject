package com.learning.CacheTestProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private EmployeeRepo empRepo;

	
	@CacheEvict(value = "employees",allEntries = true)
	@PostMapping("/addEmployee")
	public void addStudent(@RequestBody Employee emp) {
		empRepo.save(emp);
	}
	
	
	@Cacheable("employees")
	@GetMapping("/")
	public List<Employee> getStudents() {
		System.out.println(" Get all the employee records");
	return	empRepo.findAll();

	}
	
	
	
}
