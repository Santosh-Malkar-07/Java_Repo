package com.hibernate.app.inheritancemapping.tableperhierarchy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Contract_Employee1")
@DiscriminatorValue("contractemployee1")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contract_Employee1 extends Employee1 {

	private float pay_per_hours;

	private String contract_duration;
}
