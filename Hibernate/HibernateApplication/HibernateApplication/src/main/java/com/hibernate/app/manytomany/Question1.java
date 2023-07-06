package com.hibernate.app.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "manyToManyQuestion")
public class Question1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String qname;

	@ManyToMany(targetEntity = Answer1.class, cascade = CascadeType.ALL)
	@JoinTable(name = "q_ans_Many", joinColumns = { @JoinColumn(name = "q_id") }, inverseJoinColumns = {
			@JoinColumn(name = "ans_id") })
	List<Answer1> answers;

}
