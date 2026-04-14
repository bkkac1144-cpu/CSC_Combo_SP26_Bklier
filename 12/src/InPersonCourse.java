
public class InPersonCourse extends Course {

String Room;

public InPersonCourse() {
	super();
	Room = "";
}

public InPersonCourse(String courseNum, int numSt, int maxSt, double credits, String Room) {
	super( courseNum, numSt, maxSt, credits);
	this.Room = Room;
}

public String getRoom() {
	return Room;
}

public void setRoom(String room) {
	Room = room;
}

@Override
public String toString() {
	return "\n********************" + "\nInPersonCourse " +  "\ncourseNum: " + super.getCourseNum() + "\nnumSt: " + super.getNumSt() + "\nmaxSt: " + super.getMaxSt() + "\ncredits: "
			+ super.getCredits() + "\nRoom: " + Room + "\n********************";
}



}
