//package linkedLists;
//class SLL{
//	Node head;
//	Node tail;
//	int size;
//	void insertAtEnd(int val) {
//		Node temp = new Node(val);
//		if(head==null) head = tail = temp;
//		else {
//			tail.next = temp;
//			tail = temp;
//		}
//		size++;
//	}
//	void insertAtHead(int val) {
//		Node temp = new Node(val);
//		if(head==null) head = tail = temp;
//		else {
//			temp.next = head;
//			head = temp;
//		}
//		size++;
//	}
//	void insertAtAny(int idx, int val) {
//		if(idx==0) {
//			insertAtHead(val);
//			return;
//		}
//		if(idx==size) {
//			insertAtEnd(val);
//			return;
//		}
//		if(idx>size || idx<0) {
//			System.out.println("Invalid Index!!");
//			return;
//		}
//		Node temp = new Node(val);
//		Node x = head;
//		for(int i=1;i<=idx-1;i++) {
//			x = x.next;
//		}
//		// Insert at Any
//		temp.next = x.next;
//		x.next = temp;
//		size++;
//	}
//	int getElement(int idx) throws Error {
//		if(idx == size - 1) return tail.val;
//		if(idx >=size || idx < 0) {
////			System.out.println("Invalid Index!!");
//			throw new Error("Invalid Index");
////			return -1;
//		}
//		Node temp = head;
//		for(int i=1;i<idx;i++) {
//			temp = temp.next;
//		}
//		return temp.val;
//	}
//	void set(int idx, int val) throws Error {
//		if(idx == size - 1) {
//			tail.val = val;
//		}
//		if(idx >=size || idx < 0) {
////			System.out.println("Invalid Index!!");
//			throw new Error("Bhai Error!");
////			return -1;
//		}
//		Node temp = head;
//		for(int i=1;i<idx;i++) {
//			temp = temp.next;
//		}
//		temp.val = val;
//	}
//	void display() {
//		Node temp = head;
//		while(temp!=null) {
//			System.out.print(temp.val+" ");
//			temp = temp.next;
//		}
//		System.out.println();
//	}
////	void size() {
////		System.out.println(size);
////	}
//}
//public class ImplementingLL {
//	public static void main(String[] args) {
//		SLL list = new SLL();
//
//		list.insertAtEnd(10);
//		list.insertAtEnd(20);
//		list.insertAtEnd(30); // 10 20 30
//		list.display();       // 10 20 30
//		list.insertAtEnd(40); // 10 20 30 40
//		// THIS IS FOR HEAD
//		list.insertAtHead(50);
//		list.display();       // 50 10 20 30 40
//		System.out.println(list.head.val); // Proves that the new head is 50
////		We accesssed the head node directly and w can see that in the aboce line, so (Read below line)
////		We can make the Node head, Node tail and int size as private so that, we can't change its value directly..
//
//		list.insertAtAny(2, 100);
//		list.display();
//
//		System.out.println(list.getElement(3));
//		System.out.println(list.getElement(5));
////		System.out.println(list.getElement(-2));
//		list.display();
////		Ab mai chahta hu ki 20 ki jagah 90 aajaye
//		list.set(4,90);
//		list.display();
//		// THIS IS FOR TAIL
////		System.out.println(list.size);
////		list.insertAtEnd(10);
////		list.insertAtEnd(20);
////		System.out.println(list.size);
////		list.display();
////		list.insertAtEnd(30);
////		list.insertAtEnd(40);
////		System.out.println(list.size);
////		list.insertAtEnd(24);
////		list.display();
//
//	}
//}
