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
@Table(name = "Column")
public class RefColumn {

	@Id
	@Column(name = "ColumnId")
	private int columnId;
	@Column(name = "ColumnName")
	private char columnName;
}
