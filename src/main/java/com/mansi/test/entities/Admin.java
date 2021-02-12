package com.mansi.test.entities;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;

//@Component
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"username"}))
@Entity
public class Admin 
{	
	//all constraints and annotations are remaining
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 1)
	private int adminId;
	
	@Column(length = 20)
	private String username;
	
	@Column(length = 15)
	@NotNull
	private String password;
	private String adminName;
	private String contactNo;
	private String emailId; 
	private String gender;
	private String address1;
	private String address2;
	private int pincode;
	private Date joiningDate;
	private Blob photo;
	
	//getters and setters
	public int getAdminId() 
	{
		return adminId;
	}
	
	public void setAdminId(int adminId)
	{
		this.adminId = adminId;
	}
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getAdminName() 
	{
		return adminName;
	}
	
	public void setAdminName(String adminName)
	{
		this.adminName = adminName;
	}
	
	public String getContactNo() 
	{
		return contactNo;
	}
	
	public void setContactNo(String contactNo) 
	{
		this.contactNo = contactNo;
	}
	
	public String getEmailId() 
	{
		return emailId;
	}
	
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
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
	
	public Date getJoiningDate()
	{
		return joiningDate;
	}
	
	public void setJoiningDate(Date joiningDate)
	{
		this.joiningDate = joiningDate;
	}
	
	public Blob getPhoto()
	{
		return photo;
	}
	
	public void setPhoto(Blob photo) 
	{
		this.photo = photo;
	}
	
	//parameterized constructor
	public Admin(int adminId, String username, String password, String adminName, String contactNo, String emailId,
			String gender, String address1, String address2, int pincode, Date joiningDate, Blob photo)
	{
		super();
		this.adminId = adminId;
		this.username = username;
		this.password = password;
		this.adminName = adminName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.gender = gender;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.joiningDate = joiningDate;
		this.photo = photo;
	}
	
	//dafault constructor
	public Admin() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//toString method
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", username=" + username + ", password=" + password + ", adminName="
				+ adminName + ", contactNo=" + contactNo + ", emailId=" + emailId + ", gender=" + gender + ", address1="
				+ address1 + ", address2=" + address2 + ", pincode=" + pincode + ", joiningDate=" + joiningDate
				+ ", photo=" + photo + "]";
	}
	
	
}
