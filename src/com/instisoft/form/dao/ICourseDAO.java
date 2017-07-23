package com.instisoft.form.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dto.CourseDTO;

public interface ICourseDAO {

	public boolean read(ArrayList<CourseDTO> courseList) throws ClassNotFoundException, SQLException;
	
	public boolean write(CourseDTO courseDTO) throws ClassNotFoundException, SQLException;
	
	public boolean update();
	
	public boolean delete();
}
