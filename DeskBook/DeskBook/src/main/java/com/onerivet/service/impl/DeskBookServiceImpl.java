package com.onerivet.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.model.dtos.EmployeeDto;
import com.onerivet.model.entities.Employee;
import com.onerivet.repository.DeskBookRepository;
import com.onerivet.service.DeskBookService;

@Service
public class DeskBookServiceImpl implements DeskBookService {

	@Autowired
	private DeskBookRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private Employee EmployeeDtoToEmployee(EmployeeDto dto) {
		Employee entity=this.modelMapper.map(dto,Employee.class);
				return entity;
	}
	
	private EmployeeDto EmployeeToEmployeeDto(Employee entity) {
		EmployeeDto dto=this.modelMapper.map(entity,EmployeeDto.class);
				return dto;
	}
	@Override
	public String add(EmployeeDto dto) {
		repository.save(this.EmployeeDtoToEmployee(dto));
		return "Data inserted!";
	}

	@Override
	public List<EmployeeDto> all() {
		List <Employee> employee=repository.findAll();
		List<EmployeeDto> dto=repository.findAll().stream().map(this::EmployeeToEmployeeDto).collect(Collectors.toList());
		return dto;
	}

	@Override
	public EmployeeDto getById(int id) {
		Employee employee=this.repository.findById(id).get();
		return this.EmployeeToEmployeeDto(employee);
	}

	@Override
	public EmployeeDto update(EmployeeDto dto, int id) {
		Employee employee=repository.findById(id).get();
		Employee employee1=modelMapper.map(dto, Employee.class);
		employee1.setId(id);
		repository.save(employee1);
		return modelMapper.map(employee, EmployeeDto.class);
	}
}
