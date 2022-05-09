
import java.util.ListIterator;

public class MyLinkedList {
	private Node head; // 첫번째 노드
	private Node tail; //  tail; // 마지막 노드
	private int size = 0;

	private class Node {
		private Object data; // 노드에 저장된 데이터
		private Node next; // 다음 노드를 가르키는 필드

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}

	// 처음에 추가
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) {
			tail = head;
		}
	}

	// 마지막에 추가
	public void add(Object input) {
		Node newNode = new Node(input);
		if (size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	// 중간에 추가
	public void add(int node, Object input) { // 추가하고자하는 노드 번호를 받는다
		Node cur = head;
		if (node == 0) {
			addFirst(input);
		} else {
			Node newNode = new Node(input); // 새 노드 생성
			while (--node != 0) {
				cur = cur.next; // 추가하고자하는 노드 앞번호 까지 이동
			}
			newNode.next = cur.next; // 새 노드의 next는 기존 노드의 next로 설정
			cur.next = newNode; // 앞 노드의 next를 새 노드로 설정
			size++; // 리스트의 크기 증가
		}
	}

	// 헤드 노드 삭제
	public void removeFirst() {
		Node temp = head;
		head = temp.next; // head의 next를 head로 설정
		temp = null; // 기존head의 값을 null로 설정
		size--;
	}

	// 마지막 노드 삭제
	public void removeLast() {
		// size가 잇잖아 size-1 index 를 가지는 node 삭제
		Node tmp = head;
		int k = size - 1;
		while (--k != 0) { // tail 앞까지 이동
			tmp = tmp.next;
		}
		tmp.next = null; // tail 값을 null
		tail = tmp;
		size--;
	}

	// 삭제
	public void remove(int node) { // 삭제할 노드의 인덱스를 받음
		Node cur = head;
		if (node == 0) {
			removeFirst();
		} else {
			Node temp = node(node - 1);
			Node delTarget = temp.next;
			temp.next = temp.next.next;
			delTarget = null;
			size--;
		}
	}

	// 데이터 가져오기
	public Object get(int node) {
		if (node == 0) {
			return head;
		} else if (node == size - 1) {
			return tail;
		} else {
			Node tmp = head;
			while (--node != 0) {
				tmp = tmp.next;
			}
			return tmp.next.data;
		}
	}

	// 리스트 사이즈 가져오기
	public int getSize() {
		return size;
	}

	// 전체 리스트 출력하기
	public String toString() {
		if (head == null) {
			return " [ ] ";
		} else {
			Node temp = head;
			String str = " [ ";
			while (temp.next != null) {
				str += temp.data + " , ";
				temp = temp.next;
			}
			str += temp.data;
			return str + " ] ";
		}
	}

	// 탐색
	public int indexOf(Object data) { // 찾고자하는 data를 매개변수로 대입
		Node tmp = head;
		int k = 0;
		while (tmp.data != data) { // 찾고자하는 data와 같을 때 까지 반복
			tmp = tmp.next;
			k++;
		}
		if (tmp == null) {
			return -1;
		}
		return k;
	}

	// iterator()
	public ListIterator listIterator() {
		return new ListIterator();
	}

	public class ListIterator {
		private Node lastReturned;
		private Node next;
		private int nextIndex;

		public ListIterator() {
			next = head;
			nextIndex = 0;
		}

		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}

		// hasNext()
		public boolean hasNext(Node node) {
			// next 값이 null이면 false null이 아니면 true
			return nextIndex < size;
		}

		// iterator add()
		public void add(Object input) {
			Node newNode = new Node(input);

			if (lastReturned == null) {
				head = newNode;
			} else {
				lastReturned.next = newNode;
			}
			newNode.next = next;

			lastReturned = newNode;
			nextIndex++;
			size++;

		}

		// iterator remove()
		public void remove() {
			if (nextIndex == 0) {
				throw new IllegalStateException();
			}
			MyLinkedList.this.remove(nextIndex - 1);
			nextIndex--;
		}
	}

	// 원하는 노드 선택 : 위에서는 while문을 사용하였으나 이 메소드를 사용하면 더 편리할듯
	public Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

}