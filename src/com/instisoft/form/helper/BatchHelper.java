package com.instisoft.form.helper;

import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dao.BatchDAO;
import com.instisoft.form.dto.BatchDTO;

public class BatchHelper {

private BatchDAO batchDAO;
	
	public BatchHelper() {
		batchDAO = new BatchDAO();
	}
	
	public boolean readBatches(ArrayList<BatchDTO> batchList) throws ClassNotFoundException, SQLException{
		
		if( batchList != null ){
			return batchDAO.read(batchList);
		}
		
		return false;
	}
	
	public static ArrayList<String> fetchBatchList(String courseName) throws ClassNotFoundException, SQLException{
		
		return BatchDAO.readNamesByCourse(courseName);
	}
	
	public boolean addBatch(BatchDTO batchDTO) throws ClassNotFoundException, SQLException{
		
		if(batchDTO != null){
			
			return batchDAO.write(batchDTO);
		}

		return false;
	}
}
