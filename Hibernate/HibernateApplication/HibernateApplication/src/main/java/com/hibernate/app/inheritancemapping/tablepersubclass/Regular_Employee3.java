package com.hibernate.app.inheritancemapping.tablepersubclass;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TablePerSubclassChild1")
@PrimaryKeyJoinColumn(name = "id")
public class Regular_Employee3 extends Employee3 {

	private float salary;
	private int bonus;
}
