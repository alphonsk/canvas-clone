package com.george.canvas.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	private String department;
	private String updatedBy;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedOn;
	
	public Student() {
		
	}

	public Student(String name, String department, String updatedBy, Date updatedOn) {
		super();
		this.name = name;
		this.department = department;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", department='" + department + '\'' +
				", updatedBy='" + updatedBy + '\'' +
				", updatedOn=" + updatedOn +
				'}';
	}
}
