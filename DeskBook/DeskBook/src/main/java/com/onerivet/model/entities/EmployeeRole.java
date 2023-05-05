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
@Table(name = "EmployeeRole")
public class EmployeeRole {

	@Id
	@Column(name = "EmployeeRoleId")
	private int id;
	@Column(name = "RoleId")
	private int roleId;
	@Column(name = "EmployeeId")
	private int employeeId;
}
