package com.instisoft.form.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.instisoft.form.dto.BatchDTO;

public interface IBatchDAO {
	
	public boolean read(ArrayList<BatchDTO> batchList) throws ClassNotFoundException, SQLException;
	
	public boolean write(BatchDTO batchDTO) throws ClassNotFoundException, SQLException;
	
	public boolean update();
	
	public boolean delete();
}
