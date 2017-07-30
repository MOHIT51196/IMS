package com.instisoft.form.helper;

import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dao.FacultyDAO;
import com.instisoft.form.dto.FacultyDTO;

public class FacultyHelper {
	
	private FacultyDAO facultyDAO;

	public FacultyHelper() {
		facultyDAO = new FacultyDAO();
	}
	
	public boolean readFaculties(ArrayList<FacultyDTO> facultyList) throws ClassNotFoundException, SQLException{
		
		if( facultyList != null ){
			return facultyDAO.read(facultyList);
		}
		
		return false;
	}

	public static ArrayList<String> fetchFacultyList(String courseName) throws ClassNotFoundException, SQLException{
		
		return FacultyDAO.readNamesByCourse(courseName);
	}
	
	public static ArrayList<String> fetchFacultyList() throws ClassNotFoundException, SQLException{
		
		return FacultyDAO.readNamesByCourse();
	}
}
