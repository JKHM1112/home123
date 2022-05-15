import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

//중복x 순서x
class Car {

	private String model;
	private String color;
	private int price;

	public Car(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return model + "-" + color + "-" + price + ",";
	} // └정수를 문자열로 바꾸어줌

	@Override
	public int hashCode() {
		return Objects.hash(model, color, price);
	}

	@Override
	public boolean equals(Object obj) {
		String m = ((Car) obj).model;
		String c = ((Car) obj).color;
		int p = ((Car) obj).price;
//		if (model.equals(m) && color.equals(c))
//			return true;
//		else
//			return false;
		return (model.equals(m) && color.equals(c) && price == p) ? true : false;
	}
}

//hashset으로 간것은 중복도 없고 순서도 없다.
public class HashSetEx3 {
	public static void main(String[] args) {
		Set<Car> set = new HashSet<Car>();

		set.add(new Car("Y201", "red", 100));
		set.add(new Car("Y202", "black", 200));
		set.add(new Car("Y201", "red", 300));
		set.add(new Car("Y201", "white", 400));
		set.add(new Car("Y203", "black", 500));
		// set으로 데이터를 넣겠다는 중복되서 데이터를 넣지 않겠다.

		System.out.println("cnt: " + set.size());

		for (Iterator<Car> itr = set.iterator(); itr.hasNext();) { // 데이터가 있으면 가져와라
			System.out.print(itr.next() + "\t");
		}
//		System.out.println();
//
//		for (Car s : set)	//위에랑 같은 선언문이다
//			System.out.print(s + "\t");
	}
}