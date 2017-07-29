package com.instisoft.form.dto;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class StudentDTO implements Comparable<StudentDTO>{

	private String id;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String fatherEmail;
	private String fatherContact;
	private String motherName;
	private String motherEmail;
	private String motherContact;
	private String gender;
	private String primaryEmail;
	private String secondaryEmail;
	private String primaryContact;
	private String secondaryContact;
	private LinkedHashMap<String, Address> addressMap = new LinkedHashMap<>();	//permanent and temporary
	private LinkedHashMap<String, Institution> instituteMap = new LinkedHashMap<>();	//school and graduation and post graduation
	private String enquiryId;
	private String dob;
	private String doj;
	private HashMap<String , CourseDTO> courseMap = new HashMap<>();
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getName(){
		return this.firstName + " " + this.lastName;
	}


	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherEmail() {
		return fatherEmail;
	}

	public void setFatherEmail(String fatherEmail) {
		this.fatherEmail = fatherEmail;
	}

	public String getFatherContact() {
		return fatherContact;
	}

	public void setFatherContact(String fatherContact) {
		this.fatherContact = fatherContact;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherEmail() {
		return motherEmail;
	}

	public void setMotherEmail(String motherEmail) {
		this.motherEmail = motherEmail;
	}

	public String getMotherContact() {
		return motherContact;
	}

	public void setMotherContact(String motherContact) {
		this.motherContact = motherContact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getSecondaryContact() {
		return secondaryContact;
	}

	public void setSecondaryContact(String secondaryContact) {
		this.secondaryContact = secondaryContact;
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

	public HashMap<String, CourseDTO> getCourseMap() {
		return courseMap;
	}

	public void setCourseMap(HashMap<String, CourseDTO> courseMap) {
		this.courseMap = courseMap;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		
		if(obj instanceof StudentDTO){
			return this.id.equals(((StudentDTO) obj).getId());
		}
		
		return false;
	}

	@Override
	public int compareTo(StudentDTO student) {
		return this.id.compareTo(student.getId());
	}
}
