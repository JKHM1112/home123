package com.ezen.ex03;

class Box<T> { // T에 올수 있는 대상은 Number이거나 Number를 상속한 객체만 가능
//class Box<T extends Number> { // T에 올수 있는 대상은 Number이거나 Number를 상속한 객체만 가능
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
	public int toIntvalue() {
		return ob.intValue();
	}
}
class Person {
}

public class BoundedBox {

	public static void main(String[] args) {

		Box<Double> aBox = new Box<>();
		aBox.set(new Double(100.5));

		System.out.println(aBox.get());
	}
}