import java.util.LinkedList;

public class Lister {

	public static void main(String[] args) {
	linkededlist<Integer> list = new linkededlist();
	linkededlist<String> sList = new linkededlist();
	
	sList.append("Gandalf the grey");
	sList.append("Warthog");
	sList.append("Nuclear bomb");
	sList.append("Literal Atom");
	sList.append("Gun");
	sList.display();
	
	
	list.append(21);
	list.append(34);
	list.append(12);
	list.append(42);
	list.append(58);
	list.append(14);
	
	list.display();
	System.out.println("Search for 12: " + list.search(12));
	boolean exists = list.search(12);
	if(exists) list.delete(12);
	list.display();

	}

}
