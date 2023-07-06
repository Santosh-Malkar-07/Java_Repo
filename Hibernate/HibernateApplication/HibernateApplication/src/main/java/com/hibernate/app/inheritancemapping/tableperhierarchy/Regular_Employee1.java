package com.hibernate.app.inheritancemapping.tableperhierarchy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("regularemployee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Regular_Employee1 extends Employee1 {

	private float salary;

	private int bonus;
}
