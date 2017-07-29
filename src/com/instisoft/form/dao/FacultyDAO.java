package com.instisoft.form.dao;

import static com.instisoft.common.ICommonSQL.*;
import static com.instisoft.user.common.ICommonDAO.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dto.FacultyDTO;

public class FacultyDAO implements IFacultyDAO {
	
	private static ArrayList<String> facultyNameList;

	// Reading the Batches from the DB and adding to batches Table
	@Override
	public boolean read(ArrayList<FacultyDTO> facultyList) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet =null;
		
		
		try{
			connection = getConnection();
			
			statement = connection.prepareStatement(READ_BATCH_LIST_SQL);

			resultSet = statement.executeQuery();
			
			if(resultSet.getMetaData().getColumnCount() > 0){
				
				while(resultSet.next()){
					
					FacultyDTO facultyDTO = new FacultyDTO();
					
					//code to be done
					facultyList.add(facultyDTO);
					
				}
			
				return true;
			}
			
		}
		finally{
			if(resultSet != null){
				resultSet.close();
			}
			
			if(statement != null){
				statement.close();
			}
			
			if(connection != null){
				connection.close();
			}
		}
		
		return false;
	}

	@Override
	public boolean write(FacultyDTO facultyDTO) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		int rowCount = 0;
		
		try{
			connection = getConnection();
			connection.setAutoCommit(false);
			statement = connection.prepareStatement(ADD_BATCH_SQL);
			
			// code to be done
			
			rowCount = statement.executeUpdate();
			
			if(rowCount > 0){
				connection.commit();
				return true;
			}
			else{
				connection.rollback();
			}
		}
		finally{
			
			if(statement != null){
				statement.close();
			}
			
			if(connection != null){
				connection.close();
			}
		}
		
		return false;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static ArrayList<String> readNamesByCourse(String courseName) throws SQLException, ClassNotFoundException {
		
		Connection connection = null;
		PreparedStatement stmtName = null;
		ResultSet rsName =null;
		
		try{
			connection = getConnection();
			
			stmtName = connection.prepareStatement(FIND_COURSE$FACULTY_SQL);
			stmtName.setString(1, courseName);
			rsName = stmtName.executeQuery();
			
			if(rsName.getMetaData().getColumnCount() > 0){
				
				if(facultyNameList == null){
					facultyNameList = new ArrayList<>();
				}
				else{
					facultyNameList.clear();
				}
				
				while(rsName.next()){
					
					facultyNameList.add(rsName.getString("fname"));

				}
			}
			
		}
		finally{
			
			if(rsName != null){
				rsName.close();
			}
			
			if(stmtName != null){
				stmtName.close();
			}
			
			if(connection != null){
				connection.close();
			}
		}
		
		
		
		return facultyNameList;
	}
}
