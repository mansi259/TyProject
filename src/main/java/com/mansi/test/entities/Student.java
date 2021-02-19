package com.mansi.test.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Component
@Entity
public class Student 
{
	@Id
	@Column(length = 7,nullable = false)
	@Size(max = 7)
	private int grNo;
	
	//Add Constraint in below
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Standard standardId;
	
	//add
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Parent parentId;
	
	@Column(length = 20,nullable = false)
	@Size(max = 20)
	@NotNull
	private String firstName;
	
	@Column(length = 20,nullable = false)
	@Size(max = 20)
	@NotNull
	private String middleName;
	
	@Column(length = 20,nullable = false)
	@Size(max = 20)
	@NotNull
	private String lastName;
	
	@Column(length = 20,nullable = false)
	@Size(max = 20)
	@NotNull
	private String motherName;
	
	@Column(length = 20,nullable = false)
	@Size(max = 20)
	@NotNull
	private String fatherName;
	
	@Column(length = 2,nullable = false)
	@Size(min = 1,max = 2)
	@NotNull
	private int rollNo;
	
	@Column(length = 10,nullable = false)
	@Size(min = 4,max = 10)
	@NotNull
	private String division;
	
	@Column(nullable = false)
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date admissionDate;
	
	@Column(length = 7,nullable = false)
	@Size(min = 4,max = 7)
	@NotNull
	private String stream;
	
	@Column(length = 8,nullable = false)
	@Size(min = 7,max = 8)
	@NotNull
	private String medium;
	
	@Column(length = 10,nullable = false)
	@Size(max = 10)
	@NotNull
	private String religion;
	
	@Column(length = 10,nullable = false)
	@Size(max = 10)
	@NotNull
	private String subCaste;
	
	@Column(length = 5,nullable = false)
	@Size(min = 2,max = 5)
	@NotNull
	private String category;
	
	@Column(length = 6,nullable = false)
	@Size(min = 4,max = 6)
	@NotNull
	private String gender;
	
	@Column(nullable = false)
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(length = 3)
	@Size(min = 2,max = 3)
	private String bloodGroup;
	
	@Column(length = 100,nullable = false)
	@Size(max = 100)
	@NotNull
	private String address1;
	
	@Column(length = 100,nullable = false)
	@Size(max = 100)
	@NotNull
	private String address2;
	
	@Column(length = 6,nullable = false)
	@Size(min = 6,max = 6)
	@NotNull
	private int pincode;
	
	@Column(length = 50)
	@Size(max = 50)
	private String previousSchoolName;
	
	@Column(length = 255,nullable = false)
	@Size(max = 255)
	@NotNull
	private String image;
	
	//getters and setters
	public int getGrNo() 
	{
		return grNo;
	}
	
	public void setGrNo(int grNo) 
	{
		this.grNo = grNo;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getMiddleName() 
	{
		return middleName;
	}
	
	public void setMiddleName(String middleName) 
	{
		this.middleName = middleName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getMotherName() 
	{
		return motherName;
	}
	
	public void setMotherName(String motherName) 
	{
		this.motherName = motherName;
	}
	
	public String getFatherName() 
	{
		return fatherName;
	}
	
	public void setFatherName(String fatherName) 
	{
		this.fatherName = fatherName;
	}
	
	public int getRollNo() 
	{
		return rollNo;
	}
	
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	
	public String getDivision() 
	{
		return division;
	}
	
	public void setDivision(String division) 
	{
		this.division = division;
	}
	
	public Date getAdmissionDate() 
	{
		return admissionDate;
	}
	
	public void setAdmissionDate(Date admissionDate) 
	{
		this.admissionDate = admissionDate;
	}
	
	public String getStream() 
	{
		return stream;
	}
	
	public void setStream(String stream) 
	{
		this.stream = stream;
	}
	
	public String getMedium() 
	{
		return medium;
	}
	
	public void setMedium(String medium) 
	{
		this.medium = medium;
	}
	
	public String getReligion() 
	{
		return religion;
	}
	
	public void setReligion(String religion) 
	{
		this.religion = religion;
	}
	
	public String getSubCaste() 
	{
		return subCaste;
	}
	
	public void setSubCaste(String subCaste) 
	{
		this.subCaste = subCaste;
	}
	
	public String getCategory() 
	{
		return category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public Date getDateOfBirth() 
	{
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getBloodGroup()
	{
		return bloodGroup;
	}
	
	public void setBloodGroup(String bloodGroup)
	{
		this.bloodGroup = bloodGroup;
	}
	
	public String getAddress1() 
	{
		return address1;
	}
	
	public void setAddress1(String address1) 
	{
		this.address1 = address1;
	}
	
	public String getAddress2() 
	{
		return address2;
	}
	
	public void setAddress2(String address2) 
	{
		this.address2 = address2;
	}
	
	public int getPincode() 
	{
		return pincode;
	}
	
	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}
	
	public String getPreviousSchoolName() 
	{
		return previousSchoolName;
	}
	
	public void setPreviousSchoolName(String previousSchoolName) 
	{
		this.previousSchoolName = previousSchoolName;
	}
	
	public Standard getStandardId() {
		return standardId;
	}

	public void setStandardId(Standard standardId) {
		this.standardId = standardId;
	}

	public Parent getParentId() {
		return parentId;
	}

	public void setParentId(Parent parentId) {
		this.parentId = parentId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Student(@Size(max = 7) int grNo, Standard standardId, Parent parentId,
			@Size(max = 20) @NotNull String firstName, @Size(max = 20) @NotNull String middleName,
			@Size(max = 20) @NotNull String lastName, @Size(max = 20) @NotNull String motherName,
			@Size(max = 20) @NotNull String fatherName, @Size(min = 1, max = 2) @NotNull int rollNo,
			@Size(min = 4, max = 10) @NotNull String division, @NotNull Date admissionDate,
			@Size(min = 4, max = 7) @NotNull String stream, @Size(min = 7, max = 8) @NotNull String medium,
			@Size(max = 10) @NotNull String religion, @Size(max = 10) @NotNull String subCaste,
			@Size(min = 2, max = 5) @NotNull String category, @Size(min = 4, max = 6) @NotNull String gender,
			@NotNull Date dateOfBirth, @Size(min = 2, max = 3) String bloodGroup,
			@Size(max = 100) @NotNull String address1, @Size(max = 100) @NotNull String address2,
			@Size(min = 6, max = 6) @NotNull int pincode, @Size(max = 50) String previousSchoolName,
			@Size(max = 255) @NotNull String image) {
		super();
		this.grNo = grNo;
		this.standardId = standardId;
		this.parentId = parentId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.rollNo = rollNo;
		this.division = division;
		this.admissionDate = admissionDate;
		this.stream = stream;
		this.medium = medium;
		this.religion = religion;
		this.subCaste = subCaste;
		this.category = category;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.bloodGroup = bloodGroup;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.previousSchoolName = previousSchoolName;
		this.image = image;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [grNo=" + grNo + ", standardId=" + standardId + ", parentId=" + parentId + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", motherName=" + motherName
				+ ", fatherName=" + fatherName + ", rollNo=" + rollNo + ", division=" + division + ", admissionDate="
				+ admissionDate + ", stream=" + stream + ", medium=" + medium + ", religion=" + religion + ", subCaste="
				+ subCaste + ", category=" + category + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", bloodGroup=" + bloodGroup + ", address1=" + address1 + ", address2=" + address2 + ", pincode="
				+ pincode + ", previousSchoolName=" + previousSchoolName + ", image=" + image + "]";
	}
	
	

	

	
	
	
}
