package com.instisoft.form.dto;

public class BatchDTO {

	private String id;
	private String name;
	private String courseId;
	private CourseDTO course;
	private String category;
	private String startDate;
	private String endDate;	//estimation of end Date
	private String time;
	private double hours;
	private FacultyDTO faculty;
	
	
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
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public CourseDTO getCourse() {
		return course;
	}
	public void setCourse(CourseDTO course) {
		this.course = course;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public FacultyDTO getFaculty() {
		return faculty;
	}
	public void setFaculty(FacultyDTO faculty) {
		this.faculty = faculty;
	}
	
	
	
}
