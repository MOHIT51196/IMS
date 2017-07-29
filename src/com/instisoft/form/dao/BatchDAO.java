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
import com.instisoft.form.dto.FacultyDTO;

public class BatchDAO implements IBatchDAO {

	private static ArrayList<String> batchNameList;

	// Reading the Batches from the DB and adding to batches Table
		@Override
		public boolean read(ArrayList<BatchDTO> batchList) throws ClassNotFoundException, SQLException {
			
			Connection connection = null;
			PreparedStatement stmtBatch = null;
			ResultSet rsBatch =null;
			
			PreparedStatement stmtFaculty = null;
			ResultSet rsFaculty = null;
			
			try{
				connection = getConnection();
				
				stmtBatch = connection.prepareStatement(READ_BATCH_LIST_SQL);
				
				rsBatch = stmtBatch.executeQuery();
				
				if(rsBatch.getMetaData().getColumnCount() > 0){
					
					while(rsBatch.next()){
						
						BatchDTO batchDTO = new BatchDTO();
						
						batchDTO.setId(rsBatch.getString("bid"));
						batchDTO.setName(rsBatch.getString("bname"));
						batchDTO.setCategory(rsBatch.getString("category"));
						batchDTO.setStartDate(rsBatch.getString("startdate"));
						batchDTO.setEndDate(rsBatch.getString("enddate"));
						batchDTO.setTime(rsBatch.getString("time"));
						batchDTO.setHours(rsBatch.getDouble("hour"));
						
//						CourseDTO courseDTO = CourseDAO.readById(rsBatch.getString("cid"));
						CourseDTO courseDTO = new CourseDTO();
						courseDTO.setId(rsBatch.getString("cid"));
						courseDTO.setName(rsBatch.getString("cname"));
						
						batchDTO.setCourse(courseDTO);
						
						stmtFaculty = connection.prepareStatement(FIND_BATCH$FACULTY_SQL);
						stmtFaculty.setString(1, rsBatch.getString("bname"));
						rsFaculty = stmtFaculty.executeQuery();
						
						if(rsFaculty.next()){
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
							
							batchDTO.setFaculty(facultyDTO);
						}
						
						batchList.add(batchDTO);
						
					}
				
					return true;
				}
				
			}
			finally{
				if(rsBatch != null){
					rsBatch.close();
				}
				
				if(stmtBatch != null){
					stmtBatch.close();
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
			PreparedStatement stmtBatch = null;
			int rowCount = 0;
			
			try{
				connection = getConnection();
				connection.setAutoCommit(false);
				stmtBatch = connection.prepareStatement(ADD_BATCH_SQL);
				stmtBatch.setString(1, batchDTO.getId());
				stmtBatch.setString(2, batchDTO.getName());
				stmtBatch.setString(3, batchDTO.getCourseId());
				stmtBatch.setString(4, batchDTO.getCategory());
				stmtBatch.setString(5, batchDTO.getStartDate());
				stmtBatch.setString(6, batchDTO.getEndDate());
				stmtBatch.setString(7, batchDTO.getTime());
				stmtBatch.setDouble(8, batchDTO.getHours());
				
				rowCount = stmtBatch.executeUpdate();
				
				if(rowCount > 0){
					connection.commit();
					return true;
				}
				else{
					connection.rollback();
				}
			}
			finally{
				
				if(stmtBatch != null){
					stmtBatch.close();
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
				
				stmtName = connection.prepareStatement(FIND_COURSE$BATCH_SQL);
				stmtName.setString(1, courseName);
				rsName = stmtName.executeQuery();
				
				if(rsName.getMetaData().getColumnCount() > 0){
					
					if(batchNameList == null){
						batchNameList = new ArrayList<>();
					}
					else{
						batchNameList.clear();
					}
					
					while(rsName.next()){
						
						batchNameList.add(rsName.getString("bname"));

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
			
			
			
			return batchNameList;
		}
}
