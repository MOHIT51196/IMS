package com.instisoft.utils;

import static java.util.ResourceBundle.getBundle;

import com.instisoft.user.dto.MailDTO;

public class MailingTemplate {

	private static final String COMPANY_NAME = getBundle("config").getString("project_title");
	
	private static MailingTemplate instance;
	private static  MailDTO mailDTO;
	
//	DECLARATION OF TEMPLATING STRINGS
	public static String resetPasswordTemplate;
	public static String resetPasswordSubject;

	 
	private MailingTemplate() {}
	
	public static MailingTemplate getInstance(MailDTO dto){
		
		if(instance == null){
			instance = new MailingTemplate();
		}
		
		mailDTO = dto;
		generateTemplates();
		
		return instance;
	}
	
	public String getResetPasswordSubject(){
		
		return resetPasswordSubject;
	}
	
	
	public String getResetPasswordTemplate() {
		
		return resetPasswordTemplate;
	}

//	FOR GROUPING TEMPLATE GENERATING FUNCTIONS
	private static void generateTemplates(){
		generategetResetPasswordSubject();
		generateResetPasswordTemplate();
	}

	private static void generategetResetPasswordSubject(){
		resetPasswordSubject = "Instisoft IMS - Password Recovery";
		
	}
	private static void generateResetPasswordTemplate(){
		
		resetPasswordTemplate = "Dear " + mailDTO.getName() + ","
				+ "\n\nThe password for your " + COMPANY_NAME + " ID " + mailDTO.getUsername() + " has been successfully reset."
				+ "\nIf you did not make this change or you believe an unauthorised person has accessed your account, go to settings to reset your password without delay. Following this, sign into your " + COMPANY_NAME + " account to review and update your security settings."
				+ "\nIf you need additional help, please contact " + COMPANY_NAME + " Support."
				+ "\n\nSincerely,\n"
				+ COMPANY_NAME + " Support";
	}
	
	
	
}
