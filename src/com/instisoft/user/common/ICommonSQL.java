package com.instisoft.user.common;

public interface ICommonSQL {

	final String LOGIN_SQL = "select userid,password from user_master where username=? and password=?";
	final String REGISTER_SQL = "insert into user_master(username,password,name,gender,dob,email,phone,auth_status,user_status,role_status) values(?,?,?,?,?,?,?,?,?,?)";
	final String ADD_STUDENT_SQL = "insert into student_master_tbl(sid,name,gender,dob) values(?,?,?,?)";
	final String ADD_STUDENT_DETAIL_SQL="insert into student_pr_tbl(sid,fname,femail,fphone,mname,memail,mphone) values(?,?,?,?,?,?)";
	final String ADD_STUDENT_ADDRESS_SQL="insert into student_addr_tbl(sid,loc,city,state,country,pincode,status) values(?,?,?,?,?,?,?)";
	final String ADD_STUDENT_PHONE_SQL="insert into student_phone_tbl(sid,phone,status) values(?,?,?)";
	final String ADD_STUDENT_EMAIL_SQL="insert into student_email_tbl(sid,email,status) values(?,?,?)";
	final String ADD_STUDENT_INSTITUTE_SQL="insert into student_insti_tbl(sid,name,cource,branch,pyear,status,loc,city,state,country,pincode) values(?,?,?,?,?,?,?,?,?,?,?)";
}
