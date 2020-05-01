package linkedlists;

public class Node<E> {

	public Node<E> prevNode;
	public E data;
	public Node<E> nextNode;
	public Node<E> head;

	public Node(E i) {
		data = i;
		prevNode = null;
		nextNode = null;
		head = null;
	}

}
