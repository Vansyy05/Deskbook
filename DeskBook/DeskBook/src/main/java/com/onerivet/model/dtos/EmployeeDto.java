package com.onerivet.model.dtos;

import com.onerivet.model.entities.Designation;
import com.onerivet.model.entities.ModeOfWork;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private int id;
	private String userId;
	private String emailId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String project;
	private ModeOfWork modeOfWorkId;
	private String profilePictureFileName;
	private String profilePictureFilePath;
	private Designation designationId;
	private int seatConfiguration;
	private boolean isActive;
}
