public class LinkedListClass {

	// declare my private field
	private Node head;
	private int listCount;

	// set up constructor
	public LinkedListClass() {
		listCount = 0;
		head = new Node(listCount);

	}

	// set up add method
	public void add(int index) {
		Node temp = new Node(index);
		Node current = head;

		for (int i = 1; i <= index && current.getNext() != null; i++) {
			current = current.getNext();
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		listCount++;
	}

	// set up get method
	public Object get(int index) {
		if (index <= 0)
			return 0;

		Node current = head;
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null)
				return 0;

			current = current.getNext();
		}
		return current.getData();

	}

	// set up remove method
	public boolean remove(int index) {
		if (index < 1 || index > size())
			return false;

		Node current = head;
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null)
				return false;

			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		listCount--;
		return true;
	}

	// set up size method
	public int size() {
		return listCount;
	}

	// set up toString method
	public String toString() {
		Node current = head;
		String output = "";
		while (current != null) {
			output += current.getData().toString() + " -> ";
			current = current.getNext();
		}
		return output;
	}

	// set up sort method
	public void sort() {
		for (int i = 0; i < size(); i++) {
			Node currentNode = head;
			Node next = head.next;
			for (int j = 0; j < size(); j++) {
				if (currentNode.data > next.data) {
					int temp = currentNode.data; // swap elements to get
												// ascending order
					currentNode.data = next.data;
					next.data = temp;
				}
				currentNode = next;
				next = next.next;
			}
		}
	}

	// set up reverse method
	public void Reverse() {
		Node reversedPart = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next; // swap elements to get descending order
			current.next = reversedPart;
			reversedPart = current;
			current = next;

		}
		head = reversedPart;

	}

	// set up private Node class
	private class Node {

		Node next;
		int data;

		// Node constructor
		public Node(int dataValue) {
			next = null;
			data = dataValue;
		}

		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node nextValue) {
			next = nextValue; //80 number of steps
		}
	}

}
