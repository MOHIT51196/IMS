package com.instisoft.form.helper;

import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dao.CourseDAO;
import com.instisoft.form.dto.CourseDTO;

public class CourseHelper {

	private CourseDAO courseDAO;
	
	public CourseHelper() {
		courseDAO = new CourseDAO();
	}
	
	public boolean readCourses(ArrayList<CourseDTO> courseList) throws ClassNotFoundException, SQLException{
		
		if(courseList != null){
			return courseDAO.read(courseList);
		}
		
		return false;
	}
	
	public boolean addCourse(CourseDTO courseDTO) throws ClassNotFoundException, SQLException{
		
		if(courseDTO != null){
			
			return courseDAO.write(courseDTO);
		}

		return false;
	}
}
