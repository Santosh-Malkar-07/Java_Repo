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
@Table(name = "TablePerSubclassChild2")
@PrimaryKeyJoinColumn(name = "id")
public class Contract_Employee3 extends Employee3 {

	private float pay_per_hour;
	private String contract_duration;

}
