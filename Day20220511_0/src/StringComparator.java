import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class strSort implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareToIgnoreCase(o2);
	}
	
}
public class StringComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("robot");
		list.add("Apple");
		list.add("box");
		list.add("Car");
		
		strSort sort = new strSort();
		
		Collections.sort(list, sort);
		for(String s : list)
			System.out.println(s);
	}
}