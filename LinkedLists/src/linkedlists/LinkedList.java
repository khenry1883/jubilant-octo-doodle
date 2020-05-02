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
			newNode.nextNode = head;
			head.prevNode = newNode;
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
			cursor = head;
			head = newNode;
			newNode.nextNode = head;
			head.prevNode = newNode;
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
		cursor = head;
		while (cursor != null) {
			if (cursor.data == data) {
				return cursor;
			}
			cursor = cursor.nextNode;
		}
		return null;
	}

	public Node<E> findAtPosition(int position) {
		cursor = head;
		for (int i = 1; i < position && cursor != null; i++) {
			cursor = cursor.nextNode;
		}
		return cursor;
	}

	/* Finding references */
	public Node<E> predWithData(E data) {
		cursor = head;
		while (cursor.nextNode != null) {
			if (cursor.nextNode.data == data)
				return cursor;
			cursor = cursor.nextNode;
		}
		return null;
	}

	public Node<E> findFirst() {
		Node<E> first_reference = cursor;
		while (first_reference.nextNode != cursor) {
			first_reference = first_reference.nextNode;
		}
		return first_reference;
	}

	public Node<E> findLast() {
		Node<E> last_reference = cursor;
		while (last_reference.nextNode != cursor)
			last_reference = last_reference.nextNode;
		return last_reference;
	}

	public Node<E> findSecondLast() {
		Node<E> second_last = cursor;
		while ((second_last.nextNode.nextNode) != cursor)
			second_last = second_last.nextNode;
		return second_last;
	}

	public int length() {
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
		this.cursor = this.head;
		StringBuilder str = new StringBuilder();
		str.append("\n");
		if (this.cursor != null) {
			int i = 0;
			do {
				str.append("Data:" + this.cursor.data + " ");
				this.cursor = this.cursor.nextNode;
				if (++i > this.length) {
					break;
				}
			} while (this.cursor != this.head);
		}
		str.append("}");
		return str.toString();
	}

}
