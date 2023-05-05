package com.onerivet.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EmployeeWorkingDays")
public class EmployeeWorkingDays {

	@Id
	@Column(name = "EmployeeWorkingDayId")
	private int employeeWorkingDayId;
	@Column(name = "EmployeeId")
	private int employeeId;
	@Column(name = "WorkingDayId")
	private int workingDayId;
}
