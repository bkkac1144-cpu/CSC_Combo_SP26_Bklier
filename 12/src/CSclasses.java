import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {
	public static MyFileWriter fw = new MyFileWriter("courses.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Course> courseList = new ArrayList<>();
		File file = fw.getFile();
		Course course;
		String another = "yes";
		while (another.charAt(0) == 'y') {
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
			
			addToFile(file, course);
			
			System.out.println("Do you need to enter another?");
			another = input.next();
			another = another.toLowerCase();
		}
		for (Course course1 : courseList) {
			print(course1);
		}
	}

	public static void addToFile(File file, Course course) {
		if(course instanceof InPersonCourse) {
			fw.appendToFile(file, "IP");
			InPersonCourse ipcourse= (InPersonCourse) course;
			fw.appendToFile(file, ipcourse.getRoom() + "");
		}else if(course instanceof FullRemoteCourse){
			fw.appendToFile(file, "FR");
			FullRemoteCourse frcourse = (FullRemoteCourse) course;
			fw.appendToFile(file, frcourse.getInstructorEmail()+"");
		}else if(course instanceof RealTimeRemoteCourse) {
			fw.appendToFile(file, "RTR");
			RealTimeRemoteCourse rtrcourse = (RealTimeRemoteCourse) course;
			fw.appendToFile(file, rtrcourse.getZoomInfo()+"");
		}
		fw.appendToFile(file, course.getCourseNum()+" ");
		fw.appendToFile(file, course.getNumSt()+"");
		fw.appendToFile(file, course.getMaxSt()+"");
		fw.appendToFile(file, course.getCredits()+"");
	}

	public static void print(Course course) {
		System.out.println(course);
	}

	public static void getPrinter(Course course) {
		System.out.println("Course: " + course.getCourseNum());
		System.out.println("Number of Students: " + course.getNumSt());
		System.out.println("Max Students: " + course.getMaxSt());
		System.out.println("Credits: " + course.getCredits());
		if (course instanceof InPersonCourse) {
			InPersonCourse IPcourse = (InPersonCourse) course;
			System.out.println("\n " + IPcourse.getRoom());

		} else if (course instanceof FullRemoteCourse) {
			FullRemoteCourse FRcourse = (FullRemoteCourse) course;
			System.out.println("\n" + FRcourse.getInstructorEmail());
		} else if (course instanceof RealTimeRemoteCourse) {
			RealTimeRemoteCourse RTcourse = (RealTimeRemoteCourse) course;
			System.out.println("\n" + RTcourse.getZoomInfo());

		}
	}
}
