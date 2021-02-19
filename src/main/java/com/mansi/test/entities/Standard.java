package com.mansi.test.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Component
@Entity
public class Standard 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 2,nullable = false)
	private int standardId;
	
	//Add Constraint below
	@OneToMany(mappedBy = "standardId",fetch = FetchType.LAZY)
	private List<Student> grNo; 
	
	//add
	@OneToMany(mappedBy = "standardId" ,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Subject> subjectId;
	
	
	@Column(length = 2,nullable = false)
	@Size(min = 1,max = 2)
	@NotNull
	private int standardName;
	
	@Column(length = 3,nullable = false)
	@Size(min = 2,max = 3)
	@NotNull
	private int noOfStudents;
	
	@Column(length = 2,nullable = false)
	@Size(min = 1,max = 2)
	@NotNull
	private int noOfSubjects;

	//getters and setters
	public int getStandardId() {
		return standardId;
	}

	public void setStandardId(int standardId) {
		this.standardId = standardId;
	}

	public List<Student> getGrNo() {
		return grNo;
	}

	public void setGrNo(List<Student> grNo) {
		this.grNo = grNo;
	}

	public int getStandardName() {
		return standardName;
	}

	public void setStandardName(int standardName) {
		this.standardName = standardName;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfSubjects() {
		return noOfSubjects;
	}

	public void setNoOfSubjects(int noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}

	
	public List<Subject> getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(List<Subject> subjectId) {
		this.subjectId = subjectId;
	}

	public Standard(int standardId, List<Student> grNo, List<Subject> subjectId,
			@Size(min = 1, max = 2) @NotNull int standardName, @Size(min = 2, max = 3) @NotNull int noOfStudents,
			@Size(min = 1, max = 2) @NotNull int noOfSubjects) {
		super();
		this.standardId = standardId;
		this.grNo = grNo;
		this.subjectId = subjectId;
		this.standardName = standardName;
		this.noOfStudents = noOfStudents;
		this.noOfSubjects = noOfSubjects;
	}

	public Standard() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Standard [standardId=" + standardId + ", grNo=" + grNo + ", subjectId=" + subjectId + ", standardName="
				+ standardName + ", noOfStudents=" + noOfStudents + ", noOfSubjects=" + noOfSubjects + "]";
	}

	
	
	
	
	
	
	
}
