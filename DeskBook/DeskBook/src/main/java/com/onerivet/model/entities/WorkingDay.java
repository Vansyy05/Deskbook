package com.onerivet.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "WorkingDay")
public class WorkingDay {

	@Id
	@Column(name = "WorkingDayId")
	private int workingDayId;
	@Column(name = "WorkingDay")
	private String workingDay;
	
}
