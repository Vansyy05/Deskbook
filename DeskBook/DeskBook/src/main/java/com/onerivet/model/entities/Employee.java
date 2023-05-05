package com.onerivet.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "Employee")
public class Employee {

	@Id
	@Column(name = "EmployeeId")
	private int id;
	@Column(name = "UserId")
	private String userId;
	@Column(name = "EmailId")
	private String emailId;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "PhoneNumber")
	private String phoneNumber;
	@Column(name = "Project")
	private String project;
	@Column(name = "ProfilePictureFileName")
	private String profilePictureFileName;
	@Column(name = "ProfilePictureFilePath")
	private String profilePictureFilePath;
	@OneToOne
	@JoinColumn(name = "ModeOfWorkId")
	private ModeOfWork modeOfWorkId;
	@OneToOne
	@JoinColumn(name = "DesignationId")
	private Designation designationId;
	@Column(name="isActive")
	private boolean isActive;
	
}
