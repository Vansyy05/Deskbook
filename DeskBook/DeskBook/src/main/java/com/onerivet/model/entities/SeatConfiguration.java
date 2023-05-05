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
@Table(name = "SeatConfiguration")
public class SeatConfiguration {

	@Id
	@Column(name = "SeatConfigurationId")
	private int id;
	@Column(name = "CityId")
	private int cityId;
	@Column(name = "FloorId")
	private int floorId;
	@Column(name = "ColumnId")
	private int columnId;
	@Column(name = "SeatNumberId")
	private int seatNumberId;
}
