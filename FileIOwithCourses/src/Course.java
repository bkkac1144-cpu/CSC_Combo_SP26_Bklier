
/**
 * where we set our values
 */
public class Course {
	private String courseNum = "";
	private int numSt = 0;
	private int maxSt = 0;
	private int credits = 0;

	/**
	 * This is where the values are actually set 
	 */
	public Course() {
		super();
		this.numSt = 0;
		this.maxSt = 0;
		this.credits = 0;
		this.courseNum = "";
	}

	/**
	 * this allows the values to be called upon
	 * 
	 * @param courseNum is the value for the course number that is called
	 * @param numSt this is the called value for student numbers
	 * @param maxSt this is the value that is called for the maximum students
	 * @param credits this is the value that is called for credits
	 */
	public Course(String courseNum, int numSt, int maxSt, int credits) {
		super();
		this.courseNum = courseNum;
		this.numSt = numSt;
		this.maxSt = maxSt;
		this.credits = credits;
	}

	/**
	 * these are the setters and getters provided by the system
	 * @return
	 */
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

	public void setCredits(int credits) {
		this.credits = credits;
	}

}
