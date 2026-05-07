public class linkededlist<T> {
	private Node<T> head;

	private static class Node<T>{
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	public void append(T data) {
		Node<T> newNode= new Node(data);
		if(head ==null) {
			head = newNode;
			return;
		}
		Node<T> current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	public boolean search(T target) {
		Node<T> current = head;
		while(current != null) {
			if(current.data == target)
				return true;
						current = current.next;
		}
		return false;
	}
	public void delete(T key) {
		if(head == null) return;
		
		if(head.data == key) {
			head = head.next;
		}
		Node<T> current = head;
		while(current.next != null && current.next.data != key) {
			current = current.next;
		}
		if(current.next != null)
			current.next = current.next.next;
	}
	public void display() {
		Node<T> current = head;
		while ( current != null) {
			System.out.print(current.data +"->");
			current = current.next;
		}
		System.out.println("null");
	}
}
