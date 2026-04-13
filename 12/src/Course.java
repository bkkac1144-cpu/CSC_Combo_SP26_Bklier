

public class Course {
	String str= "CSC119";
	int numSt = 0;
	int maxSt = 0;
	double credits = 0;
	
	
	public Course() {
		super();
		this.numSt = 0;
		this.maxSt = 0;
		this.credits = 0;
		this.str = "";
	}
	
	
	
	
	public Course(String str, int numSt, int maxSt, double credits) {
		super();
		this.str = str;
		this.numSt = numSt;
		this.maxSt = maxSt;
		this.credits = credits;
	}




	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getNumSt() {
		return numSt;
	}
	public void setNumSt(int numSt) {
		this.numSt = numSt;
	}
	public int getMaxSt() {
		return maxSt;
	}
	public void setMaxSt(int maxSt) {
		this.maxSt = maxSt;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}


		
	
	
	
}
