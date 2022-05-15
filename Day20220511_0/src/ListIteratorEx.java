import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		//기본적으로 수정이 안된다
		List<String> list = Arrays.asList("toy", "box", "robot", "box");
		
		System.out.println(list);
		//수정하기 위해서 타입을 변환시킨다.
		list = new ArrayList<String>(list); 
		//list.add("toy");
		//list.add("toy");
		//System.out.println(list);
		
		ListIterator<String> it = list.listIterator();	//양방향 search가능
		//it이 toy위에 부터 아래로 하나씩 참조하고있다.
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str +"\t");
		}
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.print(str +"\t");
//		}
		System.out.println();
		while(it.hasPrevious()) {
			String str = it.previous();
			System.out.print(str +"\t");
		}
		System.out.println();
		for(Iterator<String>itr=list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + "\t");
	}

}
