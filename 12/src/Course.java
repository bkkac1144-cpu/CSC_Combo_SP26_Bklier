
public class Course {
	private String courseNum = "";
	private int numSt = 0;
	private int maxSt = 0;
	private double credits = 0;

	public Course() {
		super();
		this.numSt = 0;
		this.maxSt = 0;
		this.credits = 0;
		this.courseNum = "";
	}

	public Course(String courseNum, int numSt, int maxSt, double credits) {
		super();
		this.courseNum = courseNum;
		this.numSt = numSt;
		this.maxSt = maxSt;
		this.credits = credits;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
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
