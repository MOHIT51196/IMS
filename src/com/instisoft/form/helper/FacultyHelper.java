package com.instisoft.form.helper;

import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dao.FacultyDAO;

public class FacultyHelper {

	public static ArrayList<String> fetchFacultyList(String courseName) throws ClassNotFoundException, SQLException{
		
		return FacultyDAO.readNamesByCourse(courseName);
	}
}
