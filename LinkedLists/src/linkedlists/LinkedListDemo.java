package linkedlists;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		System.out.println("Inserting Elements at Start");
		list.insertFirstNode(10);
		list.insertAtStart(20);
		list.insertAtStart(30);
		list.insertAtStart(40);
		list.insertAtStart(50);
		list.insertAtStart(60);
		System.out.println("Length:" + list.length());
		System.out.println(list);

		System.out.println("Inserting Elements at End");
		list.insertAtEnd(70);
		list.insertAtEnd(80);
		System.out.println("Length:" + list.length());
		System.out.println(list);

		System.out.println("Inserting Elements at Position");
		list.insertAtPosition(35, 4);
		System.out.println("Length:" + list.length());
		System.out.println(list);
		list.insertAtPosition(45, 6);
		System.out.println("Length:" + list.length());
		System.out.println(list);

		System.out.println("Deleting Elements at Head");
		Node<Integer> del = list.deleteAtStart();
		System.out.println("Node Deleted:" + del.data);
		System.out.println("Length:" + list.length());
		System.out.println(list);

		del = list.deleteAtStart();
		System.out.println("Node Deleted:" + del.data);
		System.out.println("Length:" + list.length());
		System.out.println(list);

		System.out.println("Deleting Elements at End");
		del = list.deleteAtEnd();
		System.out.println("Node Deleted:" + del.data);
		System.out.println("Length:" + list.length());
		System.out.println(list);

		del = list.deleteAtEnd();
		System.out.println("Node Deleted:" + del.data);
		System.out.println("Length:" + list.length());
		System.out.println(list);

		System.out.println("Deleting Elements at Position");
		del = list.deleteAtPosition(2);
		System.out.println("Node Deleted:" + del.data);
		System.out.println("Length:" + list.length());
		System.out.println(list);

		del = list.deleteAtPosition(4);
		System.out.println("Node Deleted:" + del.data);
		System.out.println("Length:" + list.length());
		System.out.println(list);

	}

}
