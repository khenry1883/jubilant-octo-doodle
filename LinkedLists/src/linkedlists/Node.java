package linkedlists;

public class Node<E> {

	public Node prevNode;
	public int data;
	public Node nextNode;

	public Node(int i) {
		data = i;
		prevNode = null;
		nextNode = null;
	}

}
