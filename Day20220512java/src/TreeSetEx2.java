import java.util.Iterator;
import java.util.TreeSet;

//┌tree구조에서는  implements를 구현해야 한다.
class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int compareTo(Person o) {

		return this.age-o.age;
	}
}

public class TreeSetEx2 {

	public static void main(String[] args) {

		TreeSet<Person> tree = new TreeSet<Person>();
		tree.add(new Person("Kim", 20));
		tree.add(new Person("Park", 50));
		tree.add(new Person("Lee", 80));
		tree.add(new Person("Lee", 80));
		tree.add(new Person("Lee", 50));
		tree.add(new Person("Kim", 29));
		tree.add(new Person("Kim", 80));

		for (Person n : tree)
			System.out.println(n);
		System.out.println("\n---------------------------------");
		Iterator<Person> itr = tree.iterator();
		while (itr.hasNext()) {
			Person n = itr.next();
			System.out.println(n.toString() + "\t");
		}
	}
}
