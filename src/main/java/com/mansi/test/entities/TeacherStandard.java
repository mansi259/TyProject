package com.mansi.test.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class TeacherStandard 
{
	@Id
	private int teacherStandardId;
	
	//add foreign key --> primary key of teacher table
	
	//add foreign key --> primary key of standard table

	
	//getters and setters
	public int getTeacherStandardId() 
	{
		return teacherStandardId;
	}

	public void setTeacherStandardId(int teacherStandardId) 
	{
		this.teacherStandardId = teacherStandardId;
	}
}
