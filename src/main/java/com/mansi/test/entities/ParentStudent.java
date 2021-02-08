package com.mansi.test.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

//@Component
@Entity
public class ParentStudent 
{
	@Id
	private int parentStudentId;

	
	//add foreign key here as primary key of parent table cause this is generalize table of parent 
	//and student
	
	//add foreign key here as primary key student table cause this is generalize table of parent 
	//and student
	
	
	//getters and setters
	public int getParentStudentId() 
	{
		return parentStudentId;
	}

	public void setParentStudentId(int parentStudentId)
	{
		this.parentStudentId = parentStudentId;
	}
	
	//create paramererized , defaul constructor and toString Method.
}
