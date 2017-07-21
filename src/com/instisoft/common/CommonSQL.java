package com.instisoft.common;

public interface CommonSQL {

	final String CREATE_COURSE_SQL = "CREATE TABLE courses(cid VARCHAR(50) PRIMARY KEY, name VARCHAR(255) NOT NULL, category VARCHAR(255), fee INT(10) NOT NULL, noc INT(5), schedule VARCHAR(255))";
	final String CREATE_FACULTYMASTER_SQL = "CREATE TABLE faculty_master(fid VARCHAR(50) PRIMARY KEY, name VARCHAR(255) NOT NULL, gender CHAR(1), dob VARCHAR(50), email VARCHAR(255) NOT NULL, phone VARCHAR(10), doj VARCHAR(50), salary INT(10), status VARCHAR(150))";
	
	final String ADD_FACULTY_SQL = "INSERT INTO faculty_master(fid,name,gender,email,phone,dob,doj,salary,status) VALUES(?,?,?,?,?,?,?,?,?)";
	final String ADD_FACULTY_ADDRESS_SQL="INSERT INTO faculty_address(fid,loc,city,state,country,pincode,status) VALUES(?,?,?,?,?,?,?)";
	final String ADD_FACULTY_PHONE_SQL="INSERT INTO faculty_phone(fid,phone,status) VALUES(?,?,?)";
	final String ADD_FACULTY_EMAIL_SQL="INSERT INTO faculty_email(fid,email,status) VALUES(?,?,?)";
	
	final String ADD_COURSE_SQL = "INSERT INTO courses(cid,name,category,fee,noc,schedule) VALUES(?,?,?,?,?,?)";
	
	
}
