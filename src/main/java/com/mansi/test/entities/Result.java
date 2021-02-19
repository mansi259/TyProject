package com.mansi.test.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Component
@Entity
public class Result 
{
	
	@Id
	@Column(length = 5,nullable = false)
	private int resultId;
	
	//Add Constraint
	@ManyToOne(fetch = FetchType.LAZY)
	private Student grNo;
	
	//Add Constraint
	@OneToMany(fetch = FetchType.LAZY)
	private List<Division> divisionId;
	
	//Add Constraint
	@ManyToOne(fetch = FetchType.LAZY)
	private ExamType examtype_id;
	
	@Column(length = 7,nullable = false)
	@Size(max = 7)
	@NotNull
	private String year;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int gujarati;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int english;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int environment;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int science;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int socialscience;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int maths;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int hindi;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int sanskrit;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int pt;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int drawing;
	
	@Column(length = 3)
	@Size(min = 1,max = 3)
	private int pathmala;
	
	@Column(length = 3,nullable = false)
	@Size(min = 1,max = 3)
	@NotNull
	private int obtainedMarks;
	
	@Column(length = 2,nullable = false)
	@Size(max = 2)
	@NotNull
	private int passingmMarks;
	
	@Column(length = 3,nullable = false)
	@Size(max = 3)
	@NotNull
	private int totalMarks;
	
	@Column(length = 2,nullable = false)
	@Size(max = 2)
	@NotNull
	private String grade;

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public Student getGrNo() {
		return grNo;
	}

	public void setGrNo(Student grNo) {
		this.grNo = grNo;
	}

	public List<Division> getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(List<Division> divisionId) {
		this.divisionId = divisionId;
	}

	public ExamType getExamtype_id() {
		return examtype_id;
	}

	public void setExamtype_id(ExamType examtype_id) {
		this.examtype_id = examtype_id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getGujarati() {
		return gujarati;
	}

	public void setGujarati(int gujarati) {
		this.gujarati = gujarati;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getEnvironment() {
		return environment;
	}

	public void setEnvironment(int environment) {
		this.environment = environment;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSocialscience() {
		return socialscience;
	}

	public void setSocialscience(int socialscience) {
		this.socialscience = socialscience;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getSanskrit() {
		return sanskrit;
	}

	public void setSanskrit(int sanskrit) {
		this.sanskrit = sanskrit;
	}

	public int getPt() {
		return pt;
	}

	public void setPt(int pt) {
		this.pt = pt;
	}

	public int getDrawing() {
		return drawing;
	}

	public void setDrawing(int drawing) {
		this.drawing = drawing;
	}

	public int getPathmala() {
		return pathmala;
	}

	public void setPathmala(int pathmala) {
		this.pathmala = pathmala;
	}

	public int getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

	public int getPassingmMarks() {
		return passingmMarks;
	}

	public void setPassingmMarks(int passingmMarks) {
		this.passingmMarks = passingmMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Result(int resultId, Student grNo, List<Division> divisionId, ExamType examtype_id,
			@Size(max = 7) @NotNull String year, @Size(min = 1, max = 3) int gujarati,
			@Size(min = 1, max = 3) int english, @Size(min = 1, max = 3) int environment,
			@Size(min = 1, max = 3) int science, @Size(min = 1, max = 3) int socialscience,
			@Size(min = 1, max = 3) int maths, @Size(min = 1, max = 3) int hindi, @Size(min = 1, max = 3) int sanskrit,
			@Size(min = 1, max = 3) int pt, @Size(min = 1, max = 3) int drawing, @Size(min = 1, max = 3) int pathmala,
			@Size(min = 1, max = 3) @NotNull int obtainedMarks, @Size(max = 2) @NotNull int passingmMarks,
			@Size(max = 3) @NotNull int totalMarks, @Size(max = 2) @NotNull String grade) {
		super();
		this.resultId = resultId;
		this.grNo = grNo;
		this.divisionId = divisionId;
		this.examtype_id = examtype_id;
		this.year = year;
		this.gujarati = gujarati;
		this.english = english;
		this.environment = environment;
		this.science = science;
		this.socialscience = socialscience;
		this.maths = maths;
		this.hindi = hindi;
		this.sanskrit = sanskrit;
		this.pt = pt;
		this.drawing = drawing;
		this.pathmala = pathmala;
		this.obtainedMarks = obtainedMarks;
		this.passingmMarks = passingmMarks;
		this.totalMarks = totalMarks;
		this.grade = grade;
	}

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", grNo=" + grNo + ", divisionId=" + divisionId + ", examtype_id="
				+ examtype_id + ", year=" + year + ", gujarati=" + gujarati + ", english=" + english + ", environment="
				+ environment + ", science=" + science + ", socialscience=" + socialscience + ", maths=" + maths
				+ ", hindi=" + hindi + ", sanskrit=" + sanskrit + ", pt=" + pt + ", drawing=" + drawing + ", pathmala="
				+ pathmala + ", obtainedMarks=" + obtainedMarks + ", passingmMarks=" + passingmMarks + ", totalMarks="
				+ totalMarks + ", grade=" + grade + "]";
	}

	
	
	
	
	
}
