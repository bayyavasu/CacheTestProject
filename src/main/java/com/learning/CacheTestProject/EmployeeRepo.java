package com.learning.CacheTestProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer	> {

	
	
}
