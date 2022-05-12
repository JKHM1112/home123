import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);

		list1.add(new Integer(5));	//int..........
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList list2 = new ArrayList(list1.subList(1, 4));	//1번 부터 4전까지 
		print(list1, list2);

		Collections.sort(list1);	//sort객체를 반환한다. list1 과 list2를 정렬한다
		Collections.sort(list2);
		print(list1, list2);

		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		list2.add("B");
		list2.add("C");			//list2에 마지막에 B를 넣는다. C를 넣는다.
		list2.add(3, "A");		//list2에 3번째 자리에 AA를 추가한다.
		print(list1, list2);

		list2.set(3, "AA");		//list2에 3번째 자리에 AA를 대체한다.
		print(list1, list2);
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));

		print(list1, list2);

		//System.out.println("get: "+list2.get(1));
		//list2에서 list1을 포함된 객체들을 삭제한다.
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}

		print(list1, list2);
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}
}
