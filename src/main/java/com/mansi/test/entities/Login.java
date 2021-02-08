package com.mansi.test.entities;

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
@Entity
//use for making unique column named username
@Table(uniqueConstraints= @UniqueConstraint(columnNames = { "username" }))
public class Login 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 4)
	private int loginId;
	
	//remaining to generate relationships and constraints
	//private UserType usertypeId;
	
	@Column(length = 20)
	//unique constraint is above in @Table annotation
	private String username;
	
	@Column(length = 15)
	@NotNull
	private String password;

	//getters and setters
	
	public int getLoginId() 
	{
		return loginId;
	}

	public void setLoginId(int loginId) 
	{
		this.loginId = loginId;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) {
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

	//parameterized constructor
	public Login(int loginId, String username, String password) 
	{
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
	}

	//default constructor
	public Login() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//to string method
	@Override
	public String toString() 
	{
		return "Login [loginId=" + loginId + ", username=" + username + ", password=" + password + "]";
	} 
	

	
	
	
}
