package linkedlists;

public class LinkedList<E> {
	private Node<E> head;
	private Node<E> start;

	/* Inserts */
	public void insertFirstNode(E data) {
		Node<E> newNode = new Node<E>(data);
		start.head = newNode;
	}

	public void insertAtStart(E data) {
		Node<E> newNode = new Node<E>(data);
		newNode.nextNode = start.head;
		start.head.prevNode = newNode;
		start.head = newNode;
	}

	public void insertAtEnd(E data) {
		Node<E> newNode = new Node<E>(data);
		Node<E> last = this.findLast();
		last.nextNode = newNode;
		newNode.prevNode = last;
	}

	public void insertAtPosition(E data, int position) {
		Node<E> newNode = new Node<E>(data);
		Node<E> position_node = this.findAtPosition(position - 1);
		if (position_node != start.head) {
			newNode.nextNode = position_node.nextNode;
			position_node.nextNode = newNode;
		}
	}

	/* Delete */
	public Node<E> deleteAtStart() {
		Node<E> toDel = this.head;
		this.head = this.head.nextNode;
		return toDel;
	}

	public Node<E> deleteAtEnd() {
		Node<E> toDel = this.findLast();
		this.findSecondLast().nextNode = start.head;
		return toDel;
	}

	public Node<E> deleteAtPosition(int position) {
		Node<E> position_node = this.findAtPosition(position);
		Node<E> prev_node = this.findAtPosition(position - 1);
		prev_node.nextNode = position_node.nextNode;
		return position_node;
	}

	/* Search */
	public Node<E> findWithData(E data) {
		Node<E> curr = this.head;
		while (curr != null) {
			if (curr.data == data) {
				return curr;
			}
			curr = curr.nextNode;
		}
		return null;
	}

	public Node<E> findAtPosition(int position) {
		Node<E> curr = this.head;
		for (int i = 1; i < position && curr != null; i++) {
			curr = curr.nextNode;
		}
		return curr;
	}

	/* Finding references */
	public Node<E> predWithData(E data) {
		Node<E> curr = this.head;
		while (curr.nextNode != null) {
			if (curr.nextNode.data == data)
				return curr;
			curr = curr.nextNode;
		}
		return null;
	}

	public Node<E> findFirst() {
		Node<E> first_reference = this.head;
		while (first_reference.nextNode != start.head) {
			first_reference = first_reference.nextNode;
		}
		return first_reference;
	}

	public Node<E> findLast() {
		Node<E> last_reference = this.head;
		while (last_reference.nextNode != start.head)
			last_reference = last_reference.nextNode;
		return last_reference;
	}

	public Node<E> findSecondLast() {
		Node<E> second_last = this.head;
		while ((second_last.nextNode.nextNode) != start.head)
			second_last = second_last.nextNode;
		return second_last;
	}

	/* Length of the linked List */
	public int length() {
		if (head == null)
			return 0;
		int length = 0;
		Node<E> curr = this.head;
		while (curr != head) {
			length += 1;
			curr = curr.nextNode;
		}
		return length;
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
