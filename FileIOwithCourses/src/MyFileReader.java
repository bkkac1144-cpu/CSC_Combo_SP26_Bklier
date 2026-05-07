import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {
	File file;
	ArrayList<Course> crsList = new ArrayList<>();

	public MyFileReader(String filename) {
		file = new File(filename);
		try (Scanner myReader = new Scanner(file)) {
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] parts = data.split(" ");
				System.out.println(data);
				String type = parts[0];
			
				String	option = parts[1];
					
				String crsNum = parts[2];
				int numStuds = Integer.valueOf(parts[3]);
				int maxStuds = Integer.valueOf(parts[4]);
				int creds = Integer.valueOf(parts[5]);
				Course course;
				if(type.equals("IP")) {
					course = new InPersonCourse(crsNum, numStuds, maxStuds, creds,  option);
				}else if(type.equals("FR")) {
					course = new FullRemoteCourse(crsNum, numStuds, maxStuds, creds, option);
				}else {
					course = new RealTimeRemoteCourse(crsNum, numStuds, maxStuds, creds, option);
				}
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}
	public ArrayList<Course> getList(){
		return crsList;
	}
}