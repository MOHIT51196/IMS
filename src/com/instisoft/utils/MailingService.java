package com.instisoft.utils;

import java.util.Properties;

import javax.mail.AuthenticationFailedException;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import com.instisoft.user.dto.MailDTO;

import static java.util.ResourceBundle.getBundle;

public class MailingService {

	private static final String HOST = getBundle("config").getString("mail_host");
	private static final String PORT = getBundle("config").getString("mail_port");
	private static final  String USERNAME = getBundle("config").getString("support_mail");
	private static String PASSWORD = getBundle("config").getString("support_pass");
	private String recipient;
	private String mailContent;
	private String subject;
	
	private Properties properties;
	private Session session ;
	private static MailingService instance = null; 

	private MailingService(){}
	
	
	public static MailingService getInstance(){
			
			if(instance == null){
				instance = new MailingService();
			}
			
			return instance;
	}
	
	public boolean launchShareActivity(MailDTO mailDTO){
		
		boolean isShared = false;
		
		//Feeding required properties to the property Object
		properties = new Properties();
		properties.put("mail.smtp.host", HOST);
		properties.put("mail.smtp.port", PORT);  
        properties.put("mail.smtp.socketFactory.port", PORT);    
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); 
		//properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.auth", true);
		
		setUserInput(mailDTO);
		
		//Session object is formed to manipulate the smtp session
		prepareSession();
		
		
		
		if( shareCode(prepareShare(session)) ){
			isShared = true;
		}
		
		return isShared;
	}
	
	
	private void setUserInput(MailDTO mailDTO){
		recipient = mailDTO.getMailId();
		subject = mailDTO.getSubject();
		mailContent = mailDTO.getMailContent();
		
	}
	
	
	private void prepareSession(){
		
			session = Session.getInstance(properties, new Authenticator(){
			@Override
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(USERNAME, PASSWORD);
			}
		});
	
	}
	
	
	private Message prepareShare(Session session){
		
		Message message = new MimeMessage(session);
		
		
		try {
			message.setFrom(new InternetAddress(USERNAME));
			
			message.addRecipient(RecipientType.TO, new InternetAddress(recipient));
			
			
			message.setSubject(subject);
			message.setText(mailContent);
				
		}
		
		
		catch (MessagingException err) {
			System.out.println("\n\n===========ERROR PREPARING THE MAIL==========\n");
			
			err.printStackTrace();
		}
		
		return message;
	}
	
	
	private static boolean shareCode(Message message){
		
		boolean isSend = false;
		
		try {
			Transport.send(message);
			isSend = true;
		} 
		
		catch(AuthenticationFailedException auth_err){
			System.out.println("\n\n===========ERROR In AUTHENTICATION==========\n");
			
			auth_err.printStackTrace();
		}
		catch (MessagingException msg_err) {
			
			System.out.println("\n\n===========ERROR SENDING THE MAIL (INTERNET CONNECTION)==========\n");
			msg_err.printStackTrace();
		}
		
		return  isSend;
	}

}
