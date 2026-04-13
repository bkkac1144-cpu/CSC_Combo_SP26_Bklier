
public class RealTimeRemoteCourse extends OnlineCourse {
	String zoomInfo;

	public RealTimeRemoteCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealTimeRemoteCourse( String str, int numSt, int maxSt, double credits, String zoomInfo) {
		super(str, numSt, maxSt, credits);
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
		return "RealTimeCourse: " + "\nstr: " + str + "\nnumSt: " + numSt + "\nmaxSt: " + maxSt + "\ncredits: "
				+ credits + "\nzoomInfo: " + zoomInfo + "\n********************";
	}

	
}
