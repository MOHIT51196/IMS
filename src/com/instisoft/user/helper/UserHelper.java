package com.instisoft.user.helper;

import com.instisoft.user.dao.UserDAO;
import com.instisoft.user.dto.UserDTO;

import java.sql.SQLException;

import static com.instisoft.utils.CommonValidations.usernameValidation;
import static com.instisoft.utils.CommonValidations.passwordVaidation;
import static com.instisoft.utils.CommonValidations.emailCharacterValidation;
import static com.instisoft.utils.CommonValidations.phoneNumberValidation;

public class UserHelper {

	private UserDAO userDAO;
	
	public UserHelper() {
		userDAO = new UserDAO();
	}
	
	public boolean doLogin(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		
		if(usernameValidation(userDTO) && passwordVaidation(userDTO)){
//			some specific validations are off write now
			
			return userDAO.read(userDTO);
		}
		
		System.out.println("Username and Password not Validated");
		
		return false;
	}
	
	public boolean doRegister(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		
		if(usernameValidation(userDTO) 
				&& passwordVaidation(userDTO) 
				&& emailCharacterValidation(userDTO) 
				&& phoneNumberValidation(userDTO) ){
			return userDAO.write(userDTO);
		}
		
		System.out.println(userDTO);
		System.out.println("User details are not Validated");
		
		return false;
	}
	
	public boolean doRecovery(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		
		if(usernameValidation(userDTO) ){
//			some specific validations are off write now
			
			return userDAO.readDetails(userDTO);
		}
		
		System.out.println("Username is not Validated");
		
		return false;
	}
}
