package com.onerivet.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SeatConfigurationDto {
	private int id;
	private int cityId;
	private int floorId;
	private int columnId;
	private int seatNumberId;
}
