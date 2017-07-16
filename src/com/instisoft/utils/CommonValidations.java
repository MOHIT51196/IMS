package com.instisoft.utils;

import com.instisoft.user.dto.UserDTO;

public class CommonValidations {
	
	public static boolean usernameValidation(UserDTO userDTO){
		
		if(userDTO.getUsername().trim().length()!=0){
			
			return true;
//			return usernameCharacterValidation(userDTO);
		}
		
		else{
			// alert code
		}
		
		return false;
	}
	
	public static boolean passwordVaidation(UserDTO userDTO){
				
		if(userDTO.getPassword().trim().length()!=0){
			
			if( passLengthValidation(userDTO)){
				
				return true;
//				return passwordCharacterValidation(userDTO);
			}
			
			else{
				// alert code
			}
		}
		else{
			// alert code
		}
		
		return false;
	}
	
	private static boolean passLengthValidation(UserDTO userDTO){
		
		boolean isPassLengthCheck = false;
		
		if(userDTO.getPassword().trim().length()>=4){
			isPassLengthCheck = true;
		}
			
		return isPassLengthCheck;
	}


	public static boolean emailCharacterValidation(UserDTO userDTO){
		
		boolean isCharacterCheck = false;
		
		if(userDTO.getEmail().trim().length() !=0 ){
			
			if(userDTO.getEmail().matches("(.*)@(.*).com")
					||userDTO.getEmail().contains("(.*)@(.*).co.in")||userDTO.getEmail().contains("(.*)@(.*).in")){
		
				isCharacterCheck = true;
				// alert message
			}
			
			else{
				// alert code
			}
		}
		
		return isCharacterCheck;
	}
	
	public static boolean numericCharacterValidation(UserDTO userDTO){
		
		boolean isCharacterCheck = false;
		
		if(userDTO.getPassword().contains("[0-9]")){
			isCharacterCheck = true;
			// alert message
		}
		else{
			// alert code
		}
		
		return isCharacterCheck;
	}
	
	public static boolean phoneNumberValidation(UserDTO userDTO){
		
		boolean isCharacterCheck = false;
		
		if(userDTO.getPhone().contains("[a-zA-Z]")){
			return false;
		}
		
		if(userDTO.getPhone().matches("^[0-9]{10}$")){
			
			isCharacterCheck = true;
			// alert message
		}
		
		else{
			// alert code
		}
		
		return isCharacterCheck;
	}
	
}
