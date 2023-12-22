package com.sr.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
@Data
@Entity
public class AssistantS{
	
@Id
@SequenceGenerator(allocationSize = 1,initialValue = 100,name = "asst",sequenceName = "sqn")
@GeneratedValue(generator = "asst",strategy = GenerationType.SEQUENCE)
private Integer id;
private String name;
private String designation;
private Double salary;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "AssistantS [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
}

	
	
	
}
