package com.mansi.test.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Division 
{
	@Id
	@Column(length = 2,nullable = false)
	private int divisionId;
	
	//add remaining Constraint 
	@OneToMany(fetch = FetchType.LAZY)
	private List<Standard> standardId;
	
	@Column(length = 10,nullable = false)
	@Size(min = 4,max = 10)
	@NotNull
	private String divisionName;
	
	
	@Column(length = 255,nullable = false)
	@Size(max = 255)
	@NotNull
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

	public List<Standard> getStandardId() {
		return standardId;
	}

	public void setStandardId(List<Standard> standardId) {
		this.standardId = standardId;
	}

	//constructor
	public Division(int divisionId, List<Standard> standardId, @Size(min = 4, max = 10) @NotNull String divisionName,
			@Size(max = 255) @NotNull String resultFile) {
		super();
		this.divisionId = divisionId;
		this.standardId = standardId;
		this.divisionName = divisionName;
		this.resultFile = resultFile;
	}

	//super constructor
	public Division() {
		super();
		// TODO Auto-generated constructor stub
	}

	//tostring override
	@Override
	public String toString() {
		return "Division [divisionId=" + divisionId + ", standardId=" + standardId + ", divisionName=" + divisionName
				+ ", resultFile=" + resultFile + "]";
	}
	
	
	
	
}
