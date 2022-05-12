import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		Person[] person = new Person[3];

		person[0] = new Person("0번선수", 2);
		person[1] = new Person("11번선수", 1);
		person[2] = new Person("222번선수", 0);

		Arrays.sort(person);

		for (Person p : person)
			System.out.println(p);
	}

}

class Person implements Comparable {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;

//		if(this.age>p.age) return 1;
//		else if(this.age<p.age) return -1;
//		else
//			return 0;
//		return this.age - p.age;	//나이 오름차순
//		return   p.age-this.age;	//나이 내림차순
//		return this.name.length()-p.name.length();	//이름 긴 순서
		return p.name.length()-this.name.length();	//이름 짧은 순서
	}

}