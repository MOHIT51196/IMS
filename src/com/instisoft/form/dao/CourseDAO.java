package com.instisoft.form.dao;

import static com.instisoft.common.ICommonSQL.ADD_COURSE_SQL;
import static com.instisoft.common.ICommonSQL.READ_COURSE_SQL;
import static com.instisoft.user.common.ICommonDAO.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dto.CourseDTO;


public class CourseDAO implements ICourseDAO {

	// Reading the COurses from the DB and adding to Courses Table
	@Override
	public boolean read(ArrayList<CourseDTO> courseList) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet =null;
		
		
		try{
			connection = getConnection();
			
			statement = connection.prepareStatement(READ_COURSE_SQL);

			resultSet = statement.executeQuery();
			
			if(resultSet.getMetaData().getColumnCount() > 0){
				
				while(resultSet.next()){
					
					CourseDTO courseDTO = new CourseDTO();
					
					courseDTO.setId(resultSet.getString("cid"));
					courseDTO.setName(resultSet.getString("name"));
					courseDTO.setCategory(resultSet.getString("category"));
					courseDTO.setCourceFee(resultSet.getDouble("fee"));
					courseDTO.setTotalClasses(resultSet.getInt("noc"));
					courseDTO.setBatchSchedule(resultSet.getString("schedule"));
					
					
					courseList.add(courseDTO);
					
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
	public boolean write(CourseDTO courseDTO) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		int rowCount = 0;
		
		try{
			connection = getConnection();
			connection.setAutoCommit(false);
			statement = connection.prepareStatement(ADD_COURSE_SQL);
			statement.setString(1, courseDTO.getId());
			statement.setString(2, courseDTO.getName());
			statement.setString(3, courseDTO.getCategory());
			statement.setDouble(4, courseDTO.getCourceFee());
			statement.setInt(5, courseDTO.getTotalClasses());
			statement.setString(6, courseDTO.getBatchSchedule());
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
}
