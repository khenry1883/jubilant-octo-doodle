package linkedlists;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<DataClass> list = new LinkedList<DataClass>();

		System.out.println("Inserting Elements at Start");
		list.insertAtStart(new DataClass("Billy", 10));
		list.insertAtStart(new DataClass("Sarah", 20));
		list.insertAtStart(new DataClass("Tom", 30));
		list.insertAtStart(new DataClass("Bob", 40));
		list.insertAtStart(new DataClass("Tara", 50));
		list.insertAtStart(new DataClass("Mary", 60));
		System.out.println("Length:" + list.length());
		System.out.println(list);

		System.out.println("Inserting Elements at End");
		list.insertAtEnd(new DataClass("Paula", 70));
		list.insertAtEnd(new DataClass("Marco", 80));
		System.out.println("Length:" + list.length());
		System.out.println(list);

		System.out.println("Inserting Elements at Position");
		list.insertAtPosition(new DataClass("Baker", 35), 4);
		System.out.println("Length:" + list.length());
		System.out.println(list);
		list.insertAtPosition(new DataClass("Lolly", 45), 6);
		System.out.println("Length:" + list.length());
		System.out.println(list);

		System.out.println("Deleting Elements at Head");
		Node<DataClass> del = list.deleteAtStart();
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
