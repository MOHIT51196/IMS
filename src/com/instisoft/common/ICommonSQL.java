package com.instisoft.common;

public interface ICommonSQL {

	final String CREATE_COURSE_SQL = "CREATE TABLE courses(cid VARCHAR(50) PRIMARY KEY, name VARCHAR(255) NOT NULL, category VARCHAR(255), fee INT(10) NOT NULL, noc INT(5), schedule VARCHAR(255))";
	final String CREATE_BATCH_SQL = "CREATE TABLE batches(bid VARCHAR(50) PRIMARY KEY, name VARCHAR(255) NOT NULL, cid VARCHAR(50) NOT NULL, category VARCHAR(255), startdate VARCHAR(50), enddate VARCHAR(50), time VARCHAR(50), hour INT(5), FOREIGN KEY(cid) REFERENCES courses(cid) ON DELETE CASCADE)";
	final String CREATE_FACULTYMASTER_SQL = "CREATE TABLE faculty_master(fid VARCHAR(50) PRIMARY KEY, name VARCHAR(255) NOT NULL, gender CHAR(1), dob VARCHAR(50), pemail VARCHAR(255), semail VARCHAR(255), pphone VARCHAR(10) NOT NULL, sphone VARCHAR(10), doj VARCHAR(50), salary INT(10), status VARCHAR(150))";
	final String CREATE_STUDENTMASTER_SQL = "CREATE TABLE student_master(sid VARCHAR(50) PRIMARY KEY, name VARCHAR(255) NOT NULL, gender CHAR(1), dob VARCHAR(50), pemail VARCHAR(255), semail VARCHAR(255), pphone VARCHAR(10) NOT NULL, sphone VARCHAR(10), fname VARCHAR(255), femail VARCHAR(255), fphone VARCHAR(10), mname VARCHAR(255), memail VARCHAR(255), mphone VARCHAR(10), doj VARCHAR(50))";
	
	
	final String ADD_FACULTY_SQL = "INSERT INTO faculty_master(fid,name,gender,pemail,semail,pphone,sphone,dob,doj,salary,status) VALUES(?,?,?,?,?,?,?,?,?)";
	final String ADD_FACULTY_ADDRESS_SQL="INSERT INTO faculty_address(fid,loc,city,state,country,pincode,status) VALUES(?,?,?,?,?,?,?)";
	
	final String ADD_COURSE_SQL = "INSERT INTO courses(cid,name,category,fee,noc,schedule) VALUES(?,?,?,?,?,?)";
	final String READ_COURSE_SQL = "SELECT * FROM courses";
	final String FIND_COURSE_SQL = "SELECT * FROM courses WHERE id=?";
	
	
	final String ADD_BATCH_SQL = "INSERT INTO batches(bid,name,cid,category,startdate,enddate,time,hour) VALUES(?,?,?,?,?,?,?,?)";
	final String READ_BATCH_SQL = "SELECT * FROM batches b, courses c WHERE b.cid = c.cid";
}
