package finalProject;

public class Date {
	private int day, month, year;
	
	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 2000;
		//january 1st, 2000
	}
	
	public Date(int m, int d, int y) {
		this.setDay(d);
		this.setMonth(m);
		this.setYear(y);
	}
	
	//getters
	public int getDay() { return this.day; }
	public int getMonth() { return this.month; }
	public int getYear() {return this.year; }
	
	//setters
	public void setDay(int d) {
		int maxDays;
		if (month == 2) maxDays = 29;
		else if (month == 4 || month == 6 || month == 9 || month == 11) 
			maxDays = 30;
		else 
			maxDays = 31;
		
		if (day < 1 || day > maxDays) {
			day = 1;
		}
	}
	
	public void setMonth(int m) {
		if (m < 1 || m > 12) 
			this.month = 1;
		else
			this.month = m;
		this.setDay(this.day);
	}
	
	public void setYear(int y) {
		if (y <= 0) 
			this.year = 2000;
		else
			this.year = y;
	}
	
	//default stuff
	public String toString() {
		return "" + this.month + "-" + this.day + "-" + this.year;
	}
	
	//mabye theres a better way to do this
	public int compareTo(Date other) {
		if (other.getYear() > this.year)
			return -1;
		else if (other.getYear() < this.year)
			return 1;
		else {
			if (other.getMonth() > this.month)
				return -1;
			else if (other.getMonth() < this.month)
				return 1;
			else {
				if (other.getDay() > this.day)
					return -1;
				else if (other.getDay() < this.day)
					return 1;
				else
					return 0;
			}
		}
	}
}
