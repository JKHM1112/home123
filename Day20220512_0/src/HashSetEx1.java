import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("toy");
		set.add("box");
		set.add("robot");
		set.add("Box");
		set.add("toy"); // 중복되서 들어가지 않았다.

		System.out.println("cnt: " + set.size());

		for (Iterator<String> itr = set.iterator(); itr.hasNext();) { // 데이터가 있으면 가져와라
			System.out.print(itr.next() + "\t");
		}
		System.out.println();

		for (String s : set)
			System.out.print(s + "\t");
	}
}

