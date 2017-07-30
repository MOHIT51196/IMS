package com.instisoft.common;

public interface ICommonSQL {

	final String CREATE_COURSE_SQL = "CREATE TABLE courses(cid VARCHAR(50) PRIMARY KEY, cname VARCHAR(255) NOT NULL, category VARCHAR(255), fee INT(10) NOT NULL, noc INT(5), schedule VARCHAR(255))";
	final String CREATE_BATCH_SQL = "CREATE TABLE batches(bid VARCHAR(50) PRIMARY KEY, bname VARCHAR(255) NOT NULL, cid VARCHAR(50) NOT NULL, category VARCHAR(255), startdate VARCHAR(50), enddate VARCHAR(50), time VARCHAR(50), hour INT(5), FOREIGN KEY(cid) REFERENCES courses(cid) ON DELETE CASCADE)";
	final String CREATE_FACULTYMASTER_SQL = "CREATE TABLE faculty_master(fid VARCHAR(50) PRIMARY KEY, fname VARCHAR(255) NOT NULL, gender CHAR(1), dob VARCHAR(50), pemail VARCHAR(255), semail VARCHAR(255), pphone VARCHAR(10) NOT NULL, sphone VARCHAR(10), doj VARCHAR(50), salary INT(10), status VARCHAR(150))";
	final String CREATE_STUDENTMASTER_SQL = "CREATE TABLE student_master(sid VARCHAR(50) PRIMARY KEY, sname VARCHAR(255) NOT NULL, gender CHAR(1), dob VARCHAR(50), pemail VARCHAR(255), semail VARCHAR(255), pphone VARCHAR(10) NOT NULL, sphone VARCHAR(10), fname VARCHAR(255), femail VARCHAR(255), fphone VARCHAR(10), mname VARCHAR(255), memail VARCHAR(255), mphone VARCHAR(10), doj VARCHAR(50))";
	final String CREATE_ADDRESS_SQL = "CREATE TABLE addresses(aid INT PRIMARY KEY AUTO_INCREMENT, loc VARCHAR(255), city VARCHAR(100), state VARCHAR(150) NOT NULL, country VARCHAR(100) NOT NULL, pincode VARCHAR(20), status CHAR(1) NOT NULL)";
	
	
	final String ADD_FACULTY_SQL = "INSERT INTO faculty_master(fid,fname,gender,pemail,semail,pphone,sphone,dob,doj,salary,status) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	final String ADD_FACULTY$ADDRESS_SQL="INSERT INTO faculty_address_mapping(fid,aid) VALUES(?,?)";
	final String ADD_FACULTY$BATCH_SQL = "INSERT INTO faculty_batch_mapping(fid,bid) VALUES(?,?)";
	final String READ_FACULTY_NAMES_SQL = "SELECT fname FROM faculty_master";
	final String READ_FACULTY_LIST_SQL = "SELECT * FROM faculty_master f, faculty_batch_mapping fb,  batches b, faculty_address_mapping fa, addresses a WHERE f.fid = fb.fid and fb.bid = b.bid and f.fid = fa.fid and fa.aid = a.aid";
	final String FIND_FACULTY$BATCH_SQL = "SELECT * FROM faculty_master f,  batches b, faculty_batch_mapping fb WHERE f.fname=? and f.fid = fb.fid and fb.bid = b.bid";
	final String FIND_FACULTY_SQL = "SELECT * FROM faculty_master WHERE f.fname=?";
	
	
	final String ADD_ADDRESS_SQL = "INSERT INTO addresses(loc,city,state,country,pincode,status) VALUES(?,?,?,?,?,?)";
	final String FIND_ADDRESS_WITH_PIN_SQL = "SELECT * FROM addresses WHERE loc=? and pincode=?";
	final String FIND_ADDRESS_WITHOUT_PIN_SQL = "SELECT * FROM addresses WHERE loc=?";
	
	final String ADD_STUDENT_SQL = "INSERT INTO student_master(sid,sname,gender,dob,pemail,semail,pphone,sphone,fname,femail,fphone,mname,memail,mphone,doj) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	final String READ_STUDENT_NAMES_SQL = "SELECT sname FROM student_master";
	final String ADD_STUDENT$ADDRESS_SQL="INSERT INTO student_address_mapping(sid,aid) VALUES(?,?)";
	final String ADD_STUDENT$BATCH_SQL = "INSERT INTO student_batch_mapping(sid,bid) VALUES(?,?)";
	
	final String ADD_COURSE_SQL = "INSERT INTO courses(cid,cname,category,fee,noc) VALUES(?,?,?,?,?)";
	final String ADD_COURSE$FACULTY = "INSERT INTO course_faculty_mapping(cid,fid) VALUES(?,(SELECT fid FROM faculty_master WHERE fname=?))";
//	final String ADD_COURSE$BATCH_SQL = "INSERT INTO course_batch_mapping(cid,bid) VALUES(?,?)";
	final String READ_COURSE_NAMES_SQL = "SELECT cname FROM courses";
	final String READ_COURSE_LIST_SQL = "SELECT * FROM courses c, course_faculty_mapping cf, faculty_master f WHERE c.cid=cf.cid and cf.fid=f.fid";
	final String FIND_COURSE_SQL = "SELECT * FROM courses WHERE cname=?";
	final String FIND_COURSE$BATCH_SQL = "SELECT * FROM courses c, course_batch_mapping cb, batches b WHERE c.cname=? and c.cid = cb.cid and cb.bid = b.bid";
	final String FIND_COURSE$FACULTY_SQL = "SELECT * FROM courses c, course_faculty_mapping cf, faculty_master b WHERE c.cname=? and c.cid = cf.cid and cf.fid = b.fid";
//	final String FIND_COURSE$FACULTY_BYID_SQL = "SELECT * FROM courses c, course_faculty_mapping cf, faculty_master b WHERE c.id=? and c.cid = cf.cid and cf.fid = b.fid";
 
	
	final String ADD_BATCH_SQL = "INSERT INTO batches(bid,bname,cid,category,startdate,enddate,time,hour) VALUES(?,?,?,?,?,?,?,?)";
	final String READ_BATCH_NAMES_SQL = "SELECT bname FROM batches";
	final String READ_BATCH_LIST_SQL = "SELECT * FROM batches b, courses c, course_batch_mapping cb WHERE c.cid = cb.cid and cb.bid = b.bid";
	final String FIND_BATCH_SQL = "SELECT * FROM batches WHERE bname=?";
	final String FIND_BATCH$FACULTY_SQL = "SELECT * FROM faculty_master f,  batches b, faculty_batch_mapping fb WHERE b.bname=? and b.bid = fb.bid and fb.fid = f.fid";
	
	
	
	
}
