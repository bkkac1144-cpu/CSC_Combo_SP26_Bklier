

public class FullRemoteCourse extends OnlineCourse {
	String Email;

	public FullRemoteCourse() {
		super();
		
	}

	public FullRemoteCourse(String str,int numSt, int maxSt, double credits, String Email) {
		super(Email, numSt, maxSt, credits);
		this.Email = Email;
	}

	public String getInstructorEmail() {
		return Email;
	}

	public void setrEmail(String Email) {
		this.Email = Email;
	}
	@Override
	public String toString() {
		return "FullRemoteCourse: " + "\nstr: " + str + "\nnumSt: " + numSt + "\nmaxSt: " + maxSt + "\ncredits: "
				+ credits + "\nEmail: " + Email+ "\n********************";
	}

	
}
