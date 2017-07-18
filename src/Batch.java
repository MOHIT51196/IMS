import java.util.Date;

public class Batch {

	private String id;
	private Cource cource;
	private String category;
	private Date startDate;
	private Date endDate;	//estimation of end Date
	private String time;
	private int hours;
	private Lecturer faculty;
	private int classCount;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Cource getCource() {
		return cource;
	}
	public void setCource(Cource cource) {
		this.cource = cource;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public Lecturer getFaculty() {
		return faculty;
	}
	public void setFaculty(Lecturer faculty) {
		this.faculty = faculty;
	}
	public int getClassCount() {
		return classCount;
	}
	public void setClassCount(int classCount) {
		this.classCount = classCount;
	}
	
	
	
	
}
