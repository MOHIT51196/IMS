package com.instisoft.form.dao;

import static com.instisoft.common.ICommonSQL.*;
import static com.instisoft.user.common.ICommonDAO.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dto.BatchDTO;
import com.instisoft.form.dto.FacultyDTO;

public class FacultyDAO implements IFacultyDAO {
	
	private static ArrayList<String> facultyNameList;

	// Reading the Batches from the DB and adding to batches Table
	@Override
	public boolean read(ArrayList<FacultyDTO> facultyList) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rsFaculty =null;
		
		
		try{
			connection = getConnection();
			
			statement = connection.prepareStatement(READ_FACULTY_LIST_SQL);

			rsFaculty = statement.executeQuery();
			
			if(rsFaculty.getMetaData().getColumnCount() > 0){
				
				while(rsFaculty.next()){
					
					FacultyDTO facultyDTO = new FacultyDTO();
					facultyDTO.setId(rsFaculty.getString("fid"));
					facultyDTO.setFirstName(rsFaculty.getString("fname").split(" ")[0]);
					facultyDTO.setLastName(rsFaculty.getString("fname").split(" ")[0]);
					facultyDTO.setGender(rsFaculty.getString("gender"));
					facultyDTO.setDob(rsFaculty.getString("dob"));
					facultyDTO.setPrimaryEmail(rsFaculty.getString("pemail"));
					facultyDTO.setSecondaryEmail(rsFaculty.getString("semail"));
					facultyDTO.setPrimaryContact(rsFaculty.getString("pphone"));
					facultyDTO.setSecondaryContact(rsFaculty.getString("sphone"));
					facultyDTO.setDoj(rsFaculty.getString("doj"));
					facultyDTO.setSalary(rsFaculty.getDouble("salary"));
					
					BatchDTO batchDTO = new BatchDTO();
					batchDTO.setId(rsFaculty.getString("bid"));
					batchDTO.setName(rsFaculty.getString("bname"));
					batchDTO.setCategory(rsFaculty.getString("category"));
					batchDTO.setStartDate(rsFaculty.getString("startdate"));
					batchDTO.setEndDate(rsFaculty.getString("enddate"));
					batchDTO.setTime(rsFaculty.getString("time"));
					batchDTO.setHours(rsFaculty.getDouble("hour"));
					
					facultyDTO.setBatch(batchDTO);
					
					facultyList.add(facultyDTO);
					
				}
			
				return true;
			}
			
		}
		finally{
			if(rsFaculty != null){
				rsFaculty.close();
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
			statement = connection.prepareStatement(ADD_FACULTY_SQL);
			
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
	
	public static ArrayList<String> readNamesByCourse() throws SQLException, ClassNotFoundException {
		
		Connection connection = null;
		PreparedStatement stmtName = null;
		ResultSet rsName =null;
		
		try{
			connection = getConnection();
			
			stmtName = connection.prepareStatement(READ_FACULTY_NAMES_SQL);
			
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
