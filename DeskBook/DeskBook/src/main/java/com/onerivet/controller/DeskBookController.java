package com.onerivet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.model.dtos.EmployeeDto;
import com.onerivet.model.entities.Employee;
import com.onerivet.service.DeskBookService;
@RestController
@RequestMapping("/api")
public class DeskBookController {

	@Autowired
	private DeskBookService service;
	
	public String add(EmployeeDto dto) {
		return service.add(dto);
	}
	
	@GetMapping("/")
	public List<EmployeeDto> all(){
		return service.all();
	}
	
	@GetMapping("/{id}")
	public EmployeeDto getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@PutMapping("/{id}")
	public EmployeeDto update(@RequestBody EmployeeDto dto,@PathVariable int id) {
		System.out.println(dto.getDesignationId().getId());
		return service.update(dto, id);
	}
	
}
