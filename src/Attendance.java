import java.sql.Time;

class Attendance {

	private int totalDays;
	private int totalWorkDays;
	private int presentDays;
	private int absentDays;
	private boolean isPresent;
	private Time enrtyTime;
	private Time exitTime;
	
	
	
	public int getTotalDays() {
		return totalDays;
	}



	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}



	public int getTotalWorkDays() {
		return totalWorkDays;
	}



	public void setTotalWorkDays(int totalWorkDays) {
		this.totalWorkDays = totalWorkDays;
	}



	public int getPresentDays() {
		return presentDays;
	}



	public void setPresentDays(int presentDays) {
		this.presentDays = presentDays;
	}



	public int getAbsentDays() {
		return absentDays;
	}



	public void setAbsentDays(int absentDays) {
		this.absentDays = absentDays;
	}

	
	public boolean isPresent() {
		return isPresent;
	}



	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	

	public Time getEnrtyTime() {
		return enrtyTime;
	}



	public void setEnrtyTime(Time enrtyTime) {
		this.enrtyTime = enrtyTime;
	}



	public Time getExitTime() {
		return exitTime;
	}



	public void setExitTime(Time exitTime) {
		this.exitTime = exitTime;
	}



	public void registerAttendance(boolean isPresent){
		this.isPresent = isPresent;
		
		if( isPresent ){
			this.presentDays++;
		}
		else{
			this.absentDays++;
		}
				
	}
	

	public double getAttendanceInPercentage(){
		return ( presentDays / totalWorkDays ) * 100;
	}
	
	
}
