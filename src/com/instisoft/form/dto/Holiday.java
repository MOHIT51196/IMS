package com.instisoft.form.dto;
import java.sql.Date;

public class Holiday implements Comparable<Holiday> {

	private Date date;
	private String occassion;
	private String reason;
	private String desc;
	
	
	
	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getOccassion() {
		return occassion;
	}



	public void setOccassion(String occassion) {
		this.occassion = occassion;
	}



	public String getReason() {
		return reason;
	}



	public void setReason(String reason) {
		this.reason = reason;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Holiday){
			Holiday holiday = (Holiday) obj;
			return (this.date.equals(holiday.getDate())
					&& this.getOccassion().equals(holiday.getOccassion()));
		}
		
		return false;
	}

	@Override
	public int compareTo(Holiday day) {
		return this.date.compareTo(day.getDate());
	}
}
