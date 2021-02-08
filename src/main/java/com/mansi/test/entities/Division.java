package com.mansi.test.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Division 
{
	@Id
	private int divisionId;
	//add forign key --> primary key of standard table..
	private String divisionName;
	
	//here we store path of file so that's why i have decalre datatype
	//varchar (2555)
	//discuss about storing file with muskan
	private String resultFile;

	
	public int getDivisionId() 
	{
		return divisionId;
	}

	public void setDivisionId(int divisionId)
	{
		this.divisionId = divisionId;
	}

	public String getDivisionName() 
	{
		return divisionName;
	}

	public void setDivisionName(String divisionName) 
	{
		this.divisionName = divisionName;
	}

	public String getResultFile() 
	{
		return resultFile;
	}

	public void setResultFile(String resultFile)
	{
		this.resultFile = resultFile;
	}
	
	
}
