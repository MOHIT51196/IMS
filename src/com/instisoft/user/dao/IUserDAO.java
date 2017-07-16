package com.instisoft.user.dao;
import java.sql.SQLException;

import com.instisoft.user.dto.UserDTO;

public interface IUserDAO {

	public boolean read(UserDTO userDTO) throws ClassNotFoundException, SQLException;
	
	public boolean write(UserDTO userDTO) throws ClassNotFoundException, SQLException;
	
	public boolean update();
	
	public boolean delete();
}
