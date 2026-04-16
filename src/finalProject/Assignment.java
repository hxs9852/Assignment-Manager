package finalProject;

public class Assignment {
	private double gradePercent;
	private Date dueDate;
	private String title;
	private String course;
	
	public Assignment() {
		this.gradePercent = -1.0;
		this.dueDate = new Date();
		this.title = "Unnamed Assignment";
		this.course = "Unknown";
	}
	
	public Assignment(double g, Date d, String t, String c) {
		this.setGrade(g);
		this.dueDate = d;
		this.setTitle(t);
		this.setCourse(c);
	}
	
	//getters
	public double getGrade() { return this.gradePercent; }
	public Date getDueDate() { return this.dueDate; }
	public String getTitle() { return this.title; }
	public String getCourse() { return this.course; }
	
	//setters
	public void setGrade(double g) {
		if (g < 0.0)
			this.gradePercent = -1.0;
		else
			this.gradePercent = g;
	}
	
	public void setTitle(String t) {
		if (t == null)
			this.title = "Unnamed Assignment";
		else
			this.title = t;
	}
	
	public void setCourse(String c) {
		if (c == null)
			this.course = "Unknown";
		else
			this.course = c;
	}
	
	public boolean isTurnedIn() {
		return this.gradePercent != -1.0;
	}
	
	//default stuff
	public String toString() {
		return "\"" + this.title + "\"\nCourse: " + this.course + "\nDue: " + this.dueDate + "\nGrade: " + (this.isTurnedIn() ? this.gradePercent : "N/A");
	}
}
