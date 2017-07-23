package com.instisoft.form.dto;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Student implements Comparable<Student>{

	private String id;
	private String firstName;
	private String lastName;
	private String FatherName;
	private String gender;
	private String email;
	private LinkedHashMap<String, String> contactMap = new LinkedHashMap<>();	//primary and secondary
	private LinkedHashMap<String, Address> addressMap = new LinkedHashMap<>();	//permanent and temporary
	private LinkedHashMap<String, Institution> instituteMap = new LinkedHashMap<>();	//school and graduation and post graduation
	private String enquiryId;
	private String dob;
	private String doj;
	private HashMap<String , CourseDTO> courceMap = new HashMap<>();
	
	
	public String getId() {
		return id;
	}


//	public void setId(String id) {
//		this.id = id;
//	}

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFatherName() {
		return FatherName;
	}


	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LinkedHashMap<String, String> getContactMap() {
		return contactMap;
	}


	public void setContactMap(LinkedHashMap<String, String> contactMap) {
		this.contactMap = contactMap;
	}


	public LinkedHashMap<String, Address> getAddressMap() {
		return addressMap;
	}


	public void setAddressMap(LinkedHashMap<String, Address> addressMap) {
		this.addressMap = addressMap;
	}


	public LinkedHashMap<String, Institution> getInstituteMap() {
		return instituteMap;
	}


	public void setInstituteMap(LinkedHashMap<String, Institution> instituteMap) {
		this.instituteMap = instituteMap;
	}


	public String getEnquiryId() {
		return enquiryId;
	}


	public void setEnquiryId(String enquiryId) {
		this.enquiryId = enquiryId;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getDoj() {
		return doj;
	}


	public void setDoj(String doj) {
		this.doj = doj;
	}


	public HashMap<String, CourseDTO> getCourceMap() {
		return courceMap;
	}


	public void setCourceMap(HashMap<String, CourseDTO> courceMap) {
		this.courceMap = courceMap;
	}
	


	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Student){
			return this.id.equals(((Student) obj).getId());
		}
		
		return false;
	}

	@Override
	public int compareTo(Student student) {
		return this.id.compareTo(student.getId());
	}
}
