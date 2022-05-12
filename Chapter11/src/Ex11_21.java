import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_21 {

	public static void main(String[] args) {
		Set set = new HashSet();

		for (;set.size() < 6;) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		System.out.println(set);
		List list = new LinkedList(set);
		Collections.sort(list);	//정렬
		System.out.println(list);
	}
}