package com.instisoft.user.common;

public interface ICommonSQL {

	final String CREATE_USERMASTER_SQL = "CREATE TABLE user_master(userid VARCHAR(50) PRIMARY KEY, username VARCHAR(255) UNIQUE NOT NULL, password VARCHAR(200) NOT NULL, name VARCHAR(255) NOT NULL, gender CHAR(1), dob VARCHAR(50), email VARCHAR(255) NOT NULL, phone VARCHAR(10), auth_status CHAR(1), user_status CHAR(1) NOT NULL, role_status CHAR(1) NOT NULL)";

	final String LOGIN_SQL = "select userid,password from user_master where username=? and password=?";
	final String REGISTER_SQL = "insert into user_master(username,password,name,gender,dob,email,phone,auth_status,user_status,role_status) values(?,?,?,?,?,?,?,?,?,?)";
	final String ADD_STUDENT_SQL = "insert into student_master(sid,name,gender,dob) values(?,?,?,?)";
	final String ADD_STUDENT_DETAIL_SQL="insert into student_personal(sid,fname,femail,fphone,mname,memail,mphone) values(?,?,?,?,?,?)";
	final String ADD_STUDENT_ADDRESS_SQL="insert into student_address(sid,loc,city,state,country,pincode,status) values(?,?,?,?,?,?,?)";
	final String ADD_STUDENT_PHONE_SQL="insert into student_phone(sid,phone,status) values(?,?,?)";
	final String ADD_STUDENT_EMAIL_SQL="insert into student_email(sid,email,status) values(?,?,?)";
	final String ADD_STUDENT_INSTITUTE_SQL="insert into student_institute(sid,name,cource,branch,pyear,status,loc,city,state,country,pincode) values(?,?,?,?,?,?,?,?,?,?,?)";
}
