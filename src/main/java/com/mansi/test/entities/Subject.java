package com.mansi.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Subject 
{
	@Id
	@Column(length = 2,nullable = false)
	private int subjectId;
	
	//add constraint below
	@ManyToOne(fetch = FetchType.LAZY)
	private Standard standardId;
	
	//add constraint below
	@ManyToOne(fetch = FetchType.LAZY)
	private Teacher teacherId;
	
	@Column(length = 15,nullable = false)
	@Size(min = 2,max = 15)
	@NotNull
	private String subjectName;

	
	//getters and setters
	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	

	public Standard getStandardId() {
		return standardId;
	}

	public void setStandardId(Standard standardId) {
		this.standardId = standardId;
	}

	public Teacher getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Teacher teacherId) {
		this.teacherId = teacherId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Subject(int subjectId, Standard standardId, Teacher teacherId,
			@Size(min = 2, max = 15) @NotNull String subjectName) {
		super();
		this.subjectId = subjectId;
		this.standardId = standardId;
		this.teacherId = teacherId;
		this.subjectName = subjectName;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", standardId=" + standardId + ", teacherId=" + teacherId
				+ ", subjectName=" + subjectName + "]";
	}

	
	
	
}
