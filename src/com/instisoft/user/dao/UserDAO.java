package com.instisoft.user.dao;
import static com.instisoft.user.common.ICommonDAO.getConnection;
import static com.instisoft.user.common.ICommonSQL.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.instisoft.user.dto.UserDTO;


public class UserDAO implements IUserDAO  {

//	function for user login 
	@Override
	public boolean read(UserDTO userDTO) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet =null;
		
		try{
			connection = getConnection();
			statement = connection.prepareStatement(LOGIN_SQL);
			statement.setString(1, userDTO.getUsername());
			statement.setString(2, userDTO.getPassword());
			
			resultSet = statement.executeQuery();
			
			if(resultSet.next()){
				
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
	
	public boolean readDetails(UserDTO userDTO) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet =null;
		
		try{
			connection = getConnection();
			statement = connection.prepareStatement(RECOVERY_SQL);
			statement.setString(1, userDTO.getUsername());
			
			
			resultSet = statement.executeQuery();
			
			if(resultSet.next()){
				userDTO.setFirstName(resultSet.getString("name").split(" ")[0]);
				userDTO.setGender(resultSet.getString("gender"));
				userDTO.setDob(resultSet.getString("dob"));
				userDTO.setEmail(resultSet.getString("email"));
				userDTO.setPhone(resultSet.getString("phone"));
//				userDTO.setPassword(resultSet.getString("password"));
				
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
	public boolean write(UserDTO userDTO) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		int rowCount = 0;
		
		try{
			connection = getConnection();
			connection.setAutoCommit(false);
			statement = connection.prepareStatement(REGISTER_SQL);
			statement.setString(1, userDTO.getUsername());
			statement.setString(2, userDTO.getPassword());
			statement.setString(3, userDTO.getFirstName() + " " + userDTO.getLastName());
			statement.setString(4, userDTO.getGender());
			statement.setString(5, userDTO.getDob());
			statement.setString(6, userDTO.getEmail());
			statement.setString(7, userDTO.getPhone());
			statement.setString(8, userDTO.getAuth_status());
			statement.setString(9, userDTO.getUser_status());
			statement.setString(10, userDTO.getRole_status());
			
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
