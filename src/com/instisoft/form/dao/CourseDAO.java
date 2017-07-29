package com.instisoft.form.dao;

import static com.instisoft.common.ICommonSQL.ADD_COURSE_SQL;
import static com.instisoft.common.ICommonSQL.FIND_COURSE$FACULTY_SQL;
import static com.instisoft.common.ICommonSQL.FIND_COURSE_SQL;
import static com.instisoft.common.ICommonSQL.READ_COURSE_LIST_SQL;
import static com.instisoft.common.ICommonSQL.READ_COURSE_NAMES_SQL;
import static com.instisoft.user.common.ICommonDAO.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import com.instisoft.form.dto.CourseDTO;
import com.instisoft.form.dto.FacultyDTO;


public class CourseDAO implements ICourseDAO {

	private static ArrayList<String> courseNameList;
	
	// Reading the COurses from the DB and adding to Courses Table
	@Override
	public boolean read(ArrayList<CourseDTO> courseList) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;
		PreparedStatement stmtCourse = null;
		PreparedStatement stmtFaculty = null;
		ResultSet rsCourse =null;
		ResultSet rsFaculty =null;
		
		try{
			connection = getConnection();
			
			stmtCourse = connection.prepareStatement(READ_COURSE_LIST_SQL);

			rsCourse = stmtCourse.executeQuery();
			
			if(rsCourse.getMetaData().getColumnCount() > 0){
				
				while(rsCourse.next()){
					
					CourseDTO courseDTO = new CourseDTO();
					
					courseDTO.setId(rsCourse.getString("cid"));
					courseDTO.setName(rsCourse.getString("cname"));
					courseDTO.setCategory(rsCourse.getString("category"));
					courseDTO.setCourceFee(rsCourse.getDouble("fee"));
					courseDTO.setTotalClasses(rsCourse.getInt("noc"));
					courseDTO.setBatchSchedule(rsCourse.getString("schedule"));
					
					stmtFaculty = connection.prepareStatement(FIND_COURSE$FACULTY_SQL);
					stmtFaculty.setString(1, rsCourse.getString("cname"));
					rsFaculty = stmtFaculty.executeQuery();
					
					if(rsFaculty.getMetaData().getColumnCount() > 0){
						
						LinkedHashSet<FacultyDTO> facultySet = new LinkedHashSet<>();
						
						while(rsFaculty.next()){
						
							FacultyDTO facultyDTO = new FacultyDTO();
							facultyDTO.setId(rsFaculty.getString("fid"));
							facultyDTO.setFirstName(rsFaculty.getString("fname").split(" ")[0]);
							facultyDTO.setLastName(rsFaculty.getString("fname").split(" ")[1]);
							facultyDTO.setGender(rsFaculty.getString("gender"));
							facultyDTO.setDob(rsFaculty.getString("dob"));
							facultyDTO.setPrimaryEmail(rsFaculty.getString("pemail"));
							facultyDTO.setSecondaryEmail(rsFaculty.getString("semail"));
							facultyDTO.setPrimaryContact(rsFaculty.getString("pphone"));
							facultyDTO.setSecondaryContact(rsFaculty.getString("sphone"));
							facultyDTO.setDoj(rsFaculty.getString("doj"));
							facultyDTO.setSalary(rsFaculty.getString("salary"));
							facultyDTO.setStatus(rsFaculty.getString("status"));
							
							facultySet.add(facultyDTO);
						}
						
						courseDTO.setFacultySet(facultySet);
					}
					
					
					
					courseList.add(courseDTO);
				}
			
				return true;
			}
			
		}
		finally{
			
			if(rsFaculty != null){
				rsFaculty.close();
			}
			
			if(stmtFaculty != null){
				stmtFaculty.close();
			}
			
			if(rsCourse != null){
				rsCourse.close();
			}
			
			if(stmtCourse != null){
				stmtCourse.close();
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
	
	
	public static CourseDTO readById(String couseId) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet =null;
		
		
		try{
			connection = getConnection();
			
			statement = connection.prepareStatement(FIND_COURSE_SQL);

			resultSet = statement.executeQuery();
				
			if(resultSet.next()){
				
				CourseDTO courseDTO = new CourseDTO();
				
				courseDTO.setId(resultSet.getString("cid"));
				courseDTO.setName(resultSet.getString("name"));
				courseDTO.setCategory(resultSet.getString("category"));
				courseDTO.setCourceFee(resultSet.getDouble("fee"));
				courseDTO.setTotalClasses(resultSet.getInt("noc"));
				courseDTO.setBatchSchedule(resultSet.getString("schedule"));
				
				return courseDTO;
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
		
		return null;
	}
	
	public static ArrayList<String> readNames() throws SQLException, ClassNotFoundException{
		
		Connection connection = null;
		PreparedStatement stmtName = null;
		ResultSet rsName =null;
		
		try{
			connection = getConnection();
			
			stmtName = connection.prepareStatement(READ_COURSE_NAMES_SQL);

			rsName = stmtName.executeQuery();
			
			if(rsName.getMetaData().getColumnCount() > 0){
				
				if(courseNameList == null){
					courseNameList = new ArrayList<>();
				}
				else{
					courseNameList.clear();
				}
				
				while(rsName.next()){
					
					courseNameList.add(rsName.getString("cname"));

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
		
		
		return courseNameList;
	}
}
