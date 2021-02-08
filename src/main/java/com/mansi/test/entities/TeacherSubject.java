package com.mansi.test.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class TeacherSubject 
{
	@Id
	private int teacherSubjectId;
	//add foreign key --> primary key of teacher table
	//add foreign key --> primary key of subject table

	public int getTeacherSubjectId()
	{
		return teacherSubjectId;
	}

	public void setTeacherSubjectId(int teacherSubjectId)
	{
		this.teacherSubjectId = teacherSubjectId;
	}
	
	
}
