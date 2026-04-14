import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Course> courseList = new ArrayList<>();
		Course course;
		String another = "yes";
		while(another.charAt(0) == 'y'){
			System.out.println("What type of course is it? 1 = In-Person, 2 = RTR, 3 = Full Online");
			int type = input.nextInt();
			System.out.println("What is the course number?");
			String courseNum = input.next();
			System.out.println("How many students?");
			int numSt = input.nextInt();
			System.out.println("What is the maximum number of students?");
			int maxSt = input.nextInt();
			System.out.println("How many credits?");
			int credits = input.nextInt();
			if (type == 1) {
				System.out.println("What is the room number?");
				String roomNum = input.next();
				course = new InPersonCourse(courseNum, numSt, maxSt, credits, roomNum);
			} else if (type == 2) {
				System.out.println("What is the Zoom code?");
				String zoom = input.next();
				course = new RealTimeRemoteCourse(courseNum, numSt, maxSt, credits, zoom);
			} else {
				System.out.println("What is your Instructors' Email?");
				String email = input.next();
				course = new FullRemoteCourse(courseNum, numSt, maxSt, credits, email);
			}
			courseList.add(course);
			System.out.println("Do you need to enter another?");
			another = input.next();
			another = another.toLowerCase();
		}
	}

}
