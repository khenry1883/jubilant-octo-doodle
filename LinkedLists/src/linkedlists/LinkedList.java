package linkedlists;

public class LinkedList<E> {
	private Node<E> head;
	private Node<E> cursor;
	private int length;

	/* Inserts */
	public void insertAtStart(E data) {
		Node<E> newNode = new Node<E>(data);
		if (head == null) {
			head = newNode;
			cursor = head;
			length++;
		} else {
			newNode.nextNode = head;
			head.prevNode = newNode;
			head = newNode;
			length++;
		}
	}

	public void insertAtEnd(E data) {
		Node<E> newNode = new Node<E>(data);
		if (head == null) {
			head = newNode;
			cursor = head;
			length++;
		} else {
			Node<E> last = this.findLast();
			last.nextNode = newNode;
			newNode.prevNode = last;
			length++;
		}
	}

	public void insertAtPosition(E data, int position) {
		Node<E> newNode = new Node<E>(data);
		Node<E> position_node = this.findAtPosition(position - 1);
		if (position_node != head) {
			newNode.nextNode = position_node.nextNode;
			position_node.nextNode = newNode;
		}
		length++;
	}

	/* Delete */
	public Node<E> deleteAtStart() {
		Node<E> toDel = this.head;
		this.head = this.head.nextNode;
		length--;
		return toDel;
	}

	public Node<E> deleteAtEnd() {
		Node<E> toDel = this.findLast();
		this.findSecondLast().nextNode = head;
		length--;
		return toDel;
	}

	public Node<E> deleteAtPosition(int position) {
		Node<E> position_node = this.findAtPosition(position);
		Node<E> prev_node = this.findAtPosition(position - 1);
		prev_node.nextNode = position_node.nextNode;
		length--;
		return position_node;
	}

	/* Search */
	public Node<E> findWithData(E data) {
		Node<E> curr = this.cursor;
		while (curr != null) {
			if (curr.data == data) {
				return curr;
			}
			curr = curr.nextNode;
		}
		return null;
	}

	public Node<E> findAtPosition(int position) {
		Node<E> curr = this.cursor;
		for (int i = 1; i < position && curr != null; i++) {
			curr = curr.nextNode;
		}
		return curr;
	}

	/* Finding references */
	public Node<E> predWithData(E data) {
		Node<E> curr = this.cursor;
		while (curr.nextNode != null) {
			if (curr.nextNode.data == data)
				return curr;
			curr = curr.nextNode;
		}
		return null;
	}

	public Node<E> findFirst() {
		Node<E> first_reference = this.cursor;
		while (first_reference.nextNode != cursor) {
			first_reference = first_reference.nextNode;
		}
		return first_reference;
	}

	public Node<E> findLast() {
		Node<E> last_reference = this.cursor;
		while (last_reference.nextNode != cursor)
			last_reference = last_reference.nextNode;
		return last_reference;
	}

	public Node<E> findSecondLast() {
		Node<E> second_last = this.cursor;
		while ((second_last.nextNode.nextNode) != cursor)
			second_last = second_last.nextNode;
		return second_last;
	}

	/* Display - two ways */
	public void displayList() {
		Node<E> curr = this.head;
		System.out.print("\n{");
		while (curr != null) {
			System.out.print("Data:" + curr.data + " ");
			curr = curr.nextNode;
		}
		System.out.print("}");
		System.out.println();

	}

	public String toString() {
		Node<E> curr = this.head;
		StringBuilder str = new StringBuilder();
		str.append("\n{");

		while (curr != null) {
			str.append("Data:" + curr.data + " ");
			curr = curr.nextNode;
		}
		str.append("}");

		return str.toString();

	}

}
