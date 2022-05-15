import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//중복x 순서x
class Num {

	private int num;

	public Num(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	} // └정수를 문자열로 바꾸어줌

	@Override
	public int hashCode() {
		return num % 3; // 3개의 방이 만들어진다. 나머지가 0 1 2인 3개의 방
	}

	@Override
	public boolean equals(Object obj) {
		if (this.num == ((Num) obj).num)
			return true;
		else
			return false;
	}
}

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Num> set = new HashSet<Num>();

		set.add(new Num(5));// 2 2-1번
		set.add(new Num(1));// 1 1번
		set.add(new Num(3));// 0 0번
		set.add(new Num(2));// 2 2-2번
		set.add(new Num(5));// 2

		System.out.println("cnt: " + set.size());

		for (Iterator<Num> itr = set.iterator(); itr.hasNext();) { // 데이터가 있으면 가져와라
			System.out.print(itr.next() + "\t");
		}
		System.out.println();

		for (Num s : set)
			System.out.print(s + "\t");
	}
}