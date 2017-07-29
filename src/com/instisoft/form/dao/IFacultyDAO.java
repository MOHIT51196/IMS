package com.instisoft.form.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dto.FacultyDTO;

public interface IFacultyDAO {

	public boolean read(ArrayList<FacultyDTO> batchList) throws ClassNotFoundException, SQLException;
	
	public boolean write(FacultyDTO facultyDTO) throws ClassNotFoundException, SQLException;
	
	public boolean update();
	
	public boolean delete();
}
