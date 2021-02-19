package com.mansi.test.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;



@Component
@Entity
//use for making unique column named username
@Table(uniqueConstraints= @UniqueConstraint(columnNames = { "username" }))
public class Login 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 4,nullable = false)
	private int loginId;
	
	//remaining to add constraints
	@OneToMany(fetch = FetchType.LAZY)
	private List<UserType> usertypeId;
	
	@NotNull
	@Size(min = 4 , max = 20)
	@Column(length = 20,unique = true,nullable = false)
	//unique constraint is above in @Table annotation
	private String username;
	
	@Column(length = 15,nullable = false)
	@NotNull
	@Size(min = 8,max = 15)
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

	public List<UserType> getUsertypeId() {
		return usertypeId;
	}

	public void setUsertypeId(List<UserType> usertypeId) {
		this.usertypeId = usertypeId;
	}

	//parameterized constructor
	public Login(int loginId, List<UserType> usertypeId, @NotNull @Size(min = 4, max = 20) String username,
			@NotNull @Size(min = 8, max = 15) String password) {
		super();
		this.loginId = loginId;
		this.usertypeId = usertypeId;
		this.username = username;
		this.password = password;
	}

	//super Constructor
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	//toString method
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", usertypeId=" + usertypeId + ", username=" + username + ", password="
				+ password + "]";
	}

	
	
	
	
}
