package com.onerivet.service;

import java.util.List;

import com.onerivet.model.dtos.EmployeeDto;
import com.onerivet.model.entities.Employee;

public interface DeskBookService {

	public String add(EmployeeDto dto);
	
	public List<EmployeeDto> all();
	
	public EmployeeDto getById(int id);

	public EmployeeDto update(EmployeeDto dto, int id);
}
