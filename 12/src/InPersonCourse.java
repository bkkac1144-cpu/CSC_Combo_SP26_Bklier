
public class InPersonCourse extends Course {

String Room;

public InPersonCourse() {
	super();
	Room = "";
}

public InPersonCourse(String str, int numSt, int maxSt, double credits, String Room) {
	super( str, numSt, maxSt, credits);
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
	return "\n********************" + "\nInPersonCourse " +  "\nstr: " + str + "\nnumSt: " + numSt + "\nmaxSt: " + maxSt + "\ncredits: "
			+ credits + "\nRoom: " + Room + "\n********************";
}



}
