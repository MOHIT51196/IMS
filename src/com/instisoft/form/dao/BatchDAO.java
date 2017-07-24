package com.instisoft.form.dao;

import static com.instisoft.common.ICommonSQL.*;
import static com.instisoft.user.common.ICommonDAO.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dto.BatchDTO;
import com.instisoft.form.dto.CourseDTO;

public class BatchDAO implements IBatchDAO {

	// Reading the COurses from the DB and adding to Courses Table
		@Override
		public boolean read(ArrayList<BatchDTO> batchList) throws ClassNotFoundException, SQLException {
			
			Connection connection = null;
			PreparedStatement statement = null;
			ResultSet resultSet =null;
			
			
			try{
				connection = getConnection();
				
				statement = connection.prepareStatement(READ_BATCH_SQL);

				resultSet = statement.executeQuery();
				
				if(resultSet.getMetaData().getColumnCount() > 0){
					
					while(resultSet.next()){
						
						BatchDTO batchDTO = new BatchDTO();
						
						batchDTO.setId(resultSet.getString("bid"));
						batchDTO.setName(resultSet.getString("name"));
						batchDTO.setCategory(resultSet.getString("category"));
						batchDTO.setStartDate(resultSet.getString("startdate"));
						batchDTO.setEndDate(resultSet.getString("enddate"));
						batchDTO.setTime(resultSet.getString("time"));
						batchDTO.setHours(resultSet.getDouble("hour"));
						
//						CourseDTO courseDTO = CourseDAO.readById(resultSet.getString("cid"));
						CourseDTO courseDTO = new CourseDTO();
						
						courseDTO.setId(resultSet.getString("cid"));
						courseDTO.setName(resultSet.getString("name"));
						courseDTO.setCategory(resultSet.getString("category"));
						courseDTO.setCourceFee(resultSet.getDouble("fee"));
						courseDTO.setTotalClasses(resultSet.getInt("noc"));
						courseDTO.setBatchSchedule(resultSet.getString("schedule"));
						
						batchDTO.setCourse(courseDTO);
						
						batchList.add(batchDTO);
						
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
		public boolean write(BatchDTO batchDTO) throws ClassNotFoundException, SQLException {
			
			Connection connection = null;
			PreparedStatement statement = null;
			int rowCount = 0;
			
			try{
				connection = getConnection();
				connection.setAutoCommit(false);
				statement = connection.prepareStatement(ADD_BATCH_SQL);
				statement.setString(1, batchDTO.getId());
				statement.setString(2, batchDTO.getName());
				statement.setString(3, batchDTO.getCourseId());
				statement.setString(4, batchDTO.getCategory());
				statement.setString(5, batchDTO.getStartDate());
				statement.setString(6, batchDTO.getEndDate());
				statement.setString(7, batchDTO.getTime());
				statement.setDouble(8, batchDTO.getHours());
				
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
