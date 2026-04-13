
public class CSclasses {

	public static void main(String[] args) {
		Course inPer = new InPersonCourse("CSC1060", 7, 26, 4, "BP119");
		System.out.println(inPer);
		Course rtr = new FullRemoteCourse("CSC1060", 4, 30, 5, "Email");
				System.out.println(rtr);
		Course rmt = new RealTimeRemoteCourse("CSC1060", 7, 23, 8, "zoom Link");
		System.out.println(rmt);

	}

}
