package Ex12overlap;
import java.util.ArrayList;

import Apple;
import Fruit;

class Fruit 				{public String toString() {return"Fruit";}}
class Apple extends Fruit	{public String toString() {return"Apple";}}
class Grape extends Fruit	{public String toString() {return"Grape";}}
class Toy					{public String toString() {return"Toy";}}

public class Ex12_1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<GrapeBox> fruitBox = new Box<Apple>();	//에러 타입 불일치
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); 		//OK void add(Fruit item)
		
		appleBox.add(new Apple());
//		appleBox.add(new Fruit()); 
//		appleBox.add(new Toy());		Box<Apple>에는 Apple만 담을 수 있다.
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple());		Box<Toy>에는 Apple을 담을 수 없다.
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		
//		Fruit f1 = new Fruit();	//상속관계 가능하다.
//		Fruit f2 = new Apple();
//		Fruit f3 = new Grape();
//		Apple a1 = new Apple();
//		Apple a2 = new Fruit();	//상속관계 불가능하다.
	}
}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i ) { return list.get(i);}
	int size() { return list.size();}
	public String toString() {return list.toString();}
}