
public class RealTimeRemoteCourse extends OnlineCourse {
	String zoomInfo;

	public RealTimeRemoteCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealTimeRemoteCourse( String courseNum, int numSt, int maxSt, double credits, String zoomInfo) {
		super(courseNum, numSt, maxSt, credits);
		this.zoomInfo = zoomInfo;
	}

	public String getZoomInfo() {
		return zoomInfo;
	}

	public void setZoomInfo(String zoomInfo) {
		this.zoomInfo = zoomInfo;
	}
	@Override
	public String toString() {
		return "RealTimeCourse: " + "\ncourseNum: " + super.getCourseNum() + "\nnumSt: " + super.getNumSt() + "\nmaxSt: " + super.getMaxSt() + "\ncredits: "
				+ super.getCredits() + "\nzoomInfo: " + zoomInfo + "\n********************";
	}

	
}
