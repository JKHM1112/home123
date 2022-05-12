import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterratorEx {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		list.add("toy");
		list.add("box");
		list.add("rotob");
		list.add("toy");

		// list, set map
		for (String e : list)
			System.out.print(e + '\t');

		// next() >> 다음값 반환
		// hasNext() >>가져올 데이터 있는가?
		// remove >> next()호출 통해 반환된 인스턴스 삭제
		System.out.println("\n---------------------------");
		System.out.println(list);
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String str = it.next();
			if (str.equals("toy"))
				it.remove();
			System.out.print(str + '\t');
			System.out.println(list);
		}
		System.out.println();
		for(Iterator<String>itr=list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + "\t");
		
			Iterator<String> it2 = list.iterator();
			System.out.println("\n---------------------------");
			while (it2.hasNext()) {
				String str2 = it2.next();
				System.out.print(str2 + '\t');
		}
	}

}
