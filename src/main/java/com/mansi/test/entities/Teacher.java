package com.mansi.test.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Component
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"userName"}))
public class Teacher 
{
	@Id
	@Column(length = 2,nullable = false)
	private int teacherId;
	
	//add constraint in below
//	@OneToMany
//	private List<TeacherSubject> teacherSubjectId;
	
	//add constraint in below
//	@OneToMany
//	private List<TeacherStandard> teacherStandardId;
	
	@OneToMany
	private List<Standard> standardId;
	
	@OneToMany(mappedBy = "teacherId",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Subject> subjectId;
	
	@Column(length = 20,nullable = false,unique = true)
	@Size(min = 4,max = 20)
	// i had defined unique constraint of this above in @Table notation.
	@NotNull
	private String userName;
	
	@Column(length = 15,nullable = false)
	@Size(min = 8,max = 15)
	@NotNull
	private String password;
	
	@Column(length = 50,nullable = false)
	@Size(max = 50)
	@NotNull
	private String teacherName;
	
	@Column(length = 6,nullable = false)
	@Size(min = 4,max = 6)
	@NotNull
	private String gender;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	@NotNull
	private Date joiningDate;
	
	@Column(length = 40,nullable = false)
	@Size(max = 40)
	@NotNull
	private String qualification;
	
	@Column(length = 40,nullable = false)
	@Size(max = 40)
	@NotNull
	private String emailId;
	
	@Column(length = 10,nullable = false)
	@Size(min = 10,max = 10)
	@NotNull
	private String contactno;
	
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
	
	//create column of storing path of image
	@Column(length = 255,nullable = false)
	@Size(max = 255)
	@NotNull
	private String image;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public List<Standard> getStandardId() {
		return standardId;
	}

	public void setStandardId(List<Standard> standardId) {
		this.standardId = standardId;
	}

	public List<Subject> getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(List<Subject> subjectId) {
		this.subjectId = subjectId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Teacher(int teacherId, List<Standard> standardId, List<Subject> subjectId,
			@Size(min = 4, max = 20) @NotNull String userName, @Size(min = 8, max = 15) @NotNull String password,
			@Size(max = 50) @NotNull String teacherName, @Size(min = 4, max = 6) @NotNull String gender,
			@NotNull Date joiningDate, @Size(max = 40) @NotNull String qualification,
			@Size(max = 40) @NotNull String emailId, @Size(min = 10, max = 10) @NotNull String contactno,
			@Size(max = 100) @NotNull String address1, @Size(max = 100) @NotNull String address2,
			@Size(min = 6, max = 6) @NotNull int pincode, @Size(max = 255) @NotNull String image) {
		super();
		this.teacherId = teacherId;
		this.standardId = standardId;
		this.subjectId = subjectId;
		this.userName = userName;
		this.password = password;
		this.teacherName = teacherName;
		this.gender = gender;
		this.joiningDate = joiningDate;
		this.qualification = qualification;
		this.emailId = emailId;
		this.contactno = contactno;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.image = image;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", standardId=" + standardId + ", subjectId=" + subjectId
				+ ", userName=" + userName + ", password=" + password + ", teacherName=" + teacherName + ", gender="
				+ gender + ", joiningDate=" + joiningDate + ", qualification=" + qualification + ", emailId=" + emailId
				+ ", contactno=" + contactno + ", address1=" + address1 + ", address2=" + address2 + ", pincode="
				+ pincode + ", image=" + image + "]";
	}

	
	
	/*public int getTeacherId() {
		return teacherId;
	}

	
	//getters and setters
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public List<TeacherSubject> getTeacherSubjectId() {
		return teacherSubjectId;
	}

	public void setTeacherSubjectId(List<TeacherSubject> teacherSubjectId) {
		this.teacherSubjectId = teacherSubjectId;
	}

	public List<TeacherStandard> getTeacherStandardId() {
		return teacherStandardId;
	}

	public void setTeacherStandardId(List<TeacherStandard> teacherStandardId) {
		this.teacherStandardId = teacherStandardId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	public Teacher(int teacherId, List<TeacherSubject> teacherSubjectId, List<TeacherStandard> teacherStandardId,
			@Size(min = 4, max = 20) @NotNull String userName, @Size(min = 8, max = 15) @NotNull String password,
			@Size(max = 50) @NotNull String teacherName, @Size(min = 4, max = 6) @NotNull String gender,
			@NotNull Date joiningDate, @Size(max = 40) @NotNull String qualification,
			@Size(max = 40) @NotNull String emailId, @Size(min = 10, max = 10) @NotNull String contactno,
			@Size(max = 100) @NotNull String address1, @Size(max = 100) @NotNull String address2,
			@Size(min = 6, max = 6) @NotNull int pincode, @Size(max = 255) @NotNull String image) {
		super();
		this.teacherId = teacherId;
		this.teacherSubjectId = teacherSubjectId;
		this.teacherStandardId = teacherStandardId;
		this.userName = userName;
		this.password = password;
		this.teacherName = teacherName;
		this.gender = gender;
		this.joiningDate = joiningDate;
		this.qualification = qualification;
		this.emailId = emailId;
		this.contactno = contactno;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.image = image;
	}


	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherSubjectId=" + teacherSubjectId + ", teacherStandardId="
				+ teacherStandardId + ", userName=" + userName + ", password=" + password + ", teacherName="
				+ teacherName + ", gender=" + gender + ", joiningDate=" + joiningDate + ", qualification="
				+ qualification + ", emailId=" + emailId + ", contactno=" + contactno + ", address1=" + address1
				+ ", address2=" + address2 + ", pincode=" + pincode + ", image=" + image + "]";
	}
	
	
	*/
	
}
