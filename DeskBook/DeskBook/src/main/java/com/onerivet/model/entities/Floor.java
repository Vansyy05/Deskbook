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
@Table( name = "Floor", schema ="Ref" )
public class Floor {
	
	@Id
	@Column( name = "FloorId")
	private int floorId;
	@Column(name = "FloorName")
	private String floorName;
}
