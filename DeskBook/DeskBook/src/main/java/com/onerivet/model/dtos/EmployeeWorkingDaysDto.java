package com.onerivet.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeWorkingDaysDto {

	private int employeeWorkingDayId;
	private int employeeId;
	private int workingDayId;
}
