package com.instisoft.form.dto;
import java.util.LinkedHashSet;

public class CourseDTO implements Comparable<CourseDTO>{
	private String id;
	private String name;
	private String category;
	private double courceFee;
	private LinkedHashSet<FacultyDTO> facultySet = new LinkedHashSet<>();
	private int totalClasses;
	private String batchSchedule;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getCourceFee() {
		return courceFee;
	}

	public void setCourceFee(double courceFee) {
		this.courceFee = courceFee;
	}

	
	public int getTotalClasses() {
		return totalClasses;
	}

	public void setTotalClasses(int totalClasses) {
		this.totalClasses = totalClasses;
	}

	public LinkedHashSet<FacultyDTO> getFacultySet() {
		return facultySet;
	}

	public void setFacultySet(LinkedHashSet<FacultyDTO> facultySet) {
		this.facultySet = facultySet;
	}
	
	
	public String getBatchSchedule() {
		return batchSchedule;
	}

	public void setBatchSchedule(String batchSchedule) {
		this.batchSchedule = batchSchedule;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		
		if(obj instanceof CourseDTO){
			return this.id.equals(((CourseDTO) obj).getId());
		}
		
		return false;
	}
	
	@Override
	public int compareTo(CourseDTO cource) {
		return this.id.compareTo(cource.getId());
	}

}
